package com.sdercolin.vlabeler.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.sdercolin.vlabeler.model.Project

interface AppUnsavedChangesState {
    val hasUnsavedChanges: Boolean
    val projectWriteStatus: ProjectWriteStatus

    fun requestProjectSave()
    fun projectContentChanged()
    fun projectPathChanged()
    fun projectSaved()
}

/**
 * Describes the update status between [Project] state and project file
 */
enum class ProjectWriteStatus {
    Updated,
    Changed,
    UpdateRequested
}

class AppUnsavedChangesStateImpl : AppUnsavedChangesState {

    override var projectWriteStatus: ProjectWriteStatus by mutableStateOf(ProjectWriteStatus.Updated)

    override val hasUnsavedChanges: Boolean
        get() = projectWriteStatus == ProjectWriteStatus.Changed

    override fun requestProjectSave() {
        projectWriteStatus = ProjectWriteStatus.UpdateRequested
    }

    override fun projectContentChanged() {
        projectWriteStatus = ProjectWriteStatus.Changed
    }

    override fun projectPathChanged() {
        projectWriteStatus = ProjectWriteStatus.Updated
    }

    override fun projectSaved() {
        projectWriteStatus = ProjectWriteStatus.Updated
    }
}
