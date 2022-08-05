package com.sdercolin.vlabeler.ui.dialog.customization

import com.sdercolin.vlabeler.exception.CustomizedItemLoadingException
import com.sdercolin.vlabeler.model.Plugin
import com.sdercolin.vlabeler.ui.AppRecordStore
import com.sdercolin.vlabeler.ui.AppState
import com.sdercolin.vlabeler.ui.string.Strings
import com.sdercolin.vlabeler.util.CustomPluginDir
import com.sdercolin.vlabeler.util.parseJson
import java.io.File

abstract class PluginManagerDialogState<T : CustomizableItem>(
    private val pluginType: Plugin.Type,
    items: List<T>,
    private val appState: AppState,
    title: Strings,
    allowExecution: Boolean,
    appRecordStore: AppRecordStore
) : CustomizableItemManagerDialogState<T>(
    items = items,
    title = title,
    directory = getPluginsDirectory(pluginType),
    allowExecution = allowExecution,
    appRecordStore = appRecordStore
) {
    override fun saveDisabled() {
        val currentItem = items[requireNotNull(selectedIndex)]
        appRecordStore.update { setPluginDisabled(currentItem.name, currentItem.disabled) }
    }

    override suspend fun importNewItem(configFile: File) = runCatching {
        val plugin = configFile.readText().parseJson<Plugin>()
        require(plugin.type == pluginType) { "Unexpected Plugin type: ${plugin.type}" }
        val targetFolder = getPluginsDirectory(pluginType).resolve(plugin.name)
        require(configFile.parentFile.copyRecursively(targetFolder)) {
            "Failed to copy plugin to ${targetFolder.absolutePath}"
        }
        appState.reloadPlugins()
    }.getOrElse {
        throw CustomizedItemLoadingException(it)
    }

    companion object {
        private fun getPluginsDirectory(type: Plugin.Type) = CustomPluginDir.resolve(type.directoryName)
    }
}