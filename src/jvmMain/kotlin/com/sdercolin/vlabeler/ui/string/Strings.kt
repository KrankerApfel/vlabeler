package com.sdercolin.vlabeler.ui.string

import androidx.compose.runtime.Composable
import com.sdercolin.vlabeler.ui.string.Language.ChineseSimplified
import com.sdercolin.vlabeler.ui.string.Language.English
import com.sdercolin.vlabeler.ui.string.Language.Japanese

enum class Strings {
    AppName,
    MenuFile,
    MenuFileNewProject,
    MenuFileOpen,
    MenuFileOpenRecent,
    MenuFileOpenRecentClear,
    MenuFileSave,
    MenuFileSaveAs,
    MenuFileExport,
    MenuFileExportOverwrite,
    MenuFileExportOverwriteAll,
    MenuFileInvalidateCaches,
    MenuFileClose,
    MenuEdit,
    MenuEditUndo,
    MenuEditRedo,
    MenuEditTools,
    MenuEditToolsCursor,
    MenuEditToolsScissors,
    MenuEditToolsPan,
    MenuEditRenameEntry,
    MenuEditDuplicateEntry,
    MenuEditRemoveEntry,
    MenuEditToggleDone,
    MenuEditToggleStar,
    MenuEditEditTag,
    MenuEditMultipleEditMode,
    MenuView,
    MenuViewToggleMarker,
    MenuViewPinEntryList,
    MenuViewPinEntryListLocked,
    MenuViewToggleProperties,
    MenuViewToggleToolbox,
    MenuViewOpenSampleList,
    MenuNavigate,
    MenuNavigateNextEntry,
    MenuNavigatePreviousEntry,
    MenuNavigateNextSample,
    MenuNavigatePreviousSample,
    MenuNavigateJumpToEntry,
    MenuNavigateScrollFit,
    MenuTools,
    MenuToolsBatchEdit,
    MenuToolsBatchEditManagePlugins,
    MenuToolsPrerender,
    MenuSettings,
    MenuSettingsPreferences,
    MenuSettingsLabelers,
    MenuSettingsTemplatePlugins,
    MenuHelp,
    MenuHelpCheckForUpdates,
    MenuHelpOpenLogDirectory,
    MenuHelpOpenLatestRelease,
    MenuHelpOpenGitHub,
    MenuHelpJoinDiscord,
    MenuHelpAbout,
    CommonOkay,
    CommonApply,
    CommonCancel,
    CommonYes,
    CommonNo,
    CommonWarning,
    CommonError,
    CommonInputErrorPromptNumber,
    CommonInputErrorPromptInteger,
    CommonInputErrorPromptNumberRange,
    CommonInputErrorPromptNumberMin,
    CommonInputErrorPromptNumberMax,
    StarterStart,
    StarterNewProject,
    StarterOpen,
    StarterRecent,
    StarterRecentEmpty,
    StarterRecentDeleted,
    StarterNewSampleDirectory,
    StarterNewWorkingDirectory,
    StarterNewProjectTitle,
    StarterNewProjectName,
    StarterNewProjectNameWarning,
    StarterNewCacheDirectory,
    StarterNewLabeler,
    StarterNewTemplatePlugin,
    StarterNewTemplatePluginNone,
    StarterNewInputFile,
    StarterNewInputFilePlaceholder,
    StarterNewInputFileDisabledByLabeler,
    StarterNewInputFileDisabledByPlugin,
    StarterNewEncoding,
    StarterNewAutoExport,
    StarterNewAutoExportHelp,
    StarterNewWarningSelfConstructedLabelerWithTemplatePlugin,
    SampleListIncludedHeader,
    SampleListIncludedItemEntryCountSingle,
    SampleListIncludedItemEntryCountPlural,
    SampleListExcludedHeader,
    SampleListExcludedPlaceholder,
    SampleListEntryHeader,
    SampleListEntriesPlaceholderUnselected,
    SampleListEntriesPlaceholderNoEntry,
    SampleListEntriesPlaceholderNoEntryButton,
    SampleListJumpToSelectedEntryButton,
    SampleListOpenSampleDirectoryButton,
    SampleListSampleDirectoryLabel,
    SampleListSampleDirectoryRedirectButton,
    PrerendererSampleText,
    PrerendererSampleTextFinished,
    PrerendererChartText,
    PrerendererChartTextFinished,
    EditorRenderStatusLabel,
    ChooseSampleDirectoryDialogTitle,
    ChooseWorkingDirectoryDialogTitle,
    ChooseCacheDirectoryDialogTitle,
    ChooseInputFileDialogTitle,
    OpenProjectDialogTitle,
    SaveAsProjectDialogTitle,
    ExportDialogTitle,
    SetResolutionDialogDescription,
    AskIfSaveBeforeOpenDialogDescription,
    AskIfSaveBeforeExportDialogDescription,
    AskIfSaveBeforeCloseDialogDescription,
    AskIfSaveBeforeExitDialogDescription,
    InputEntryNameDialogDescription,
    InputEntryNameDuplicateDialogDescription,
    InputEntryNameCutFormerDialogDescription,
    InputEntryNameCutLatterDialogDescription,
    EditEntryNameDialogExistingError,
    AskIfRemoveEntryDialogDescription,
    AskIfRemoveEntryLastDialogDescription,
    AskIfLoadAutoSavedProjectDialogDescription,
    AskIfRedirectSampleDirectoryDialogDescription,
    PluginDialogTitle,
    PluginDialogInfoAuthor,
    PluginDialogInfoVersion,
    PluginDialogInfoContact,
    PluginDialogDescriptionMin,
    PluginDialogDescriptionMax,
    PluginDialogDescriptionMinMax,
    PluginDialogExecute,
    PluginEntrySelectorTextMatchTypeEquals,
    PluginEntrySelectorTextMatchTypeContains,
    PluginEntrySelectorTextMatchTypeStartsWith,
    PluginEntrySelectorTextMatchTypeEndsWith,
    PluginEntrySelectorTextMatchTypeRegex,
    PluginEntrySelectorNumberMatchTypeEquals,
    PluginEntrySelectorNumberMatchTypeGreaterThan,
    PluginEntrySelectorNumberMatchTypeGreaterThanOrEquals,
    PluginEntrySelectorNumberMatchTypeLessThan,
    PluginEntrySelectorNumberMatchTypeLessThanOrEquals,
    PluginEntrySelectorPreservedSubjectSample,
    PluginEntrySelectorPreservedSubjectName,
    PluginEntrySelectorPreservedSubjectTag,
    PluginEntrySelectorPreservedSubjectDone,
    PluginEntrySelectorPreservedSubjectStar,
    PluginEntrySelectorComparerValue,
    PluginEntrySelectorPreviewSummaryError,
    PluginEntrySelectorPreviewSummaryInitializing,
    PluginEntrySelectorPreviewSummary,
    PluginEntrySelectorPlaceholder,
    EditorSubTitleMultiple,
    FailedToLoadSampleFileError,
    EmptySampleDirectoryException,
    PluginRuntimeUnexpectedException,
    InvalidCreatedProjectException,
    InvalidOpenedProjectException,
    ProjectParseException,
    ProjectUpdateOnSampleException,
    InvalidEditedProjectException,
    CustomizableItemLoadingException,
    PluginRuntimeExceptionTemplate,
    LabelerManagerTitle,
    LabelerManagerImportDialogTitle,
    TemplatePluginManagerTitle,
    TemplatePluginManagerImportDialogTitle,
    MacroPluginManagerTitle,
    MacroPluginManagerImportDialogTitle,
    MacroPluginReportDialogTitle,
    CustomizableItemManagerRemoveItemConfirm,
    CustomizableItemManagerOpenDirectory,
    CustomizableItemManagerReload,
    CustomizableItemManagerLockedDescription,
    PreferencesEditorImport,
    PreferencesEditorImportDialogTitle,
    PreferencesEditorImportSuccess,
    PreferencesEditorImportFailure,
    PreferencesEditorExport,
    PreferencesEditorExportSuccess,
    PreferencesEditorExportFailure,
    PreferencesEditorExportDialogTitle,
    PreferencesEditorResetPage,
    PreferencesEditorResetAll,
    PreferencesCharts,
    PreferencesChartsDescription,
    PreferencesChartsCanvas,
    PreferencesChartsCanvasDescription,
    PreferencesChartsCanvasResolution,
    PreferencesChartsCanvasResolutionDescription,
    PreferencesChartsCanvasResolutionDefault,
    PreferencesChartsCanvasResolutionStep,
    PreferencesChartsMaxDataChunkSize,
    PreferencesChartsMaxDataChunkSizeDescription,
    PreferencesChartsWaveform,
    PreferencesChartsWaveformDescription,
    PreferencesChartsWaveformResampleDownTo,
    PreferencesChartsWaveformResampleDownToDescription,
    PreferencesChartsWaveformNormalize,
    PreferencesChartsWaveformUnitSize,
    PreferencesChartsWaveformUnitSizeDescription,
    PreferencesChartsWaveformIntensityAccuracy,
    PreferencesChartsWaveformYAxisBlankRate,
    PreferencesChartsWaveformColor,
    PreferencesChartsWaveformBackgroundColor,
    PreferencesChartsSpectrogram,
    PreferencesChartsSpectrogramDescription,
    PreferencesChartsSpectrogramEnabled,
    PreferencesChartsSpectrogramHeight,
    PreferencesChartsSpectrogramPointDensity,
    PreferencesChartsSpectrogramPointDensityDescription,
    PreferencesChartsSpectrogramHopSize,
    PreferencesChartsSpectrogramHopSizeDescription,
    PreferencesChartsSpectrogramWindowSize,
    PreferencesChartsSpectrogramWindowSizeDescription,
    PreferencesChartsSpectrogramMelScaleStep,
    PreferencesChartsSpectrogramMaxFrequency,
    PreferencesChartsSpectrogramMinIntensity,
    PreferencesChartsSpectrogramMaxIntensity,
    PreferencesChartsSpectrogramWindowType,
    PreferencesChartsSpectrogramColorPalette,
    PreferencesKeymap,
    PreferencesKeymapDescription,
    PreferencesKeymapKeyAction,
    PreferencesKeymapKeyActionDescription,
    PreferencesKeymapMouseClickAction,
    PreferencesKeymapMouseClickActionDescription,
    PreferencesKeymapMouseScrollAction,
    PreferencesKeymapMouseScrollActionDescription,
    PreferencesKeymapEditDialogTitle,
    PreferencesKeymapEditDialogDescriptionMouseClick,
    PreferencesKeymapEditDialogDescriptionMouseScroll,
    PreferencesKeymapEditDialogConflictingLabel,
    PreferencesKeymapEditDialogConflictingWarning,
    PreferencesKeymapEditDialogConflictingWarningKeep,
    PreferencesKeymapEditDialogConflictingWarningRemove,
    PreferencesView,
    PreferencesViewDescription,
    PreferencesViewLanguage,
    PreferencesViewHideSampleExtension,
    PreferencesViewAppAccentColor,
    PreferencesViewAppAccentColorVariant,
    PreferencesViewPinnedEntryListPosition,
    PreferencesViewPositionLeft,
    PreferencesViewPositionRight,
    PreferencesViewPositionTop,
    PreferencesViewPositionBottom,
    PreferencesViewCornerPositionTopLeft,
    PreferencesViewCornerPositionTopRight,
    PreferencesViewCornerPositionBottomLeft,
    PreferencesViewCornerPositionBottomRight,
    PreferencesFontSizeSmall,
    PreferencesFontSizeMedium,
    PreferencesFontSizeLarge,
    PreferencesEditor,
    PreferencesEditorDescription,
    PreferencesEditorPlayerCursorColor,
    PreferencesEditorPlayerLockedDrag,
    PreferencesEditorPlayerLockedDragDescription,
    PreferencesEditorPlayerLockedDragUseLabeler,
    PreferencesEditorPlayerLockedDragUseStart,
    PreferencesEditorPlayerLockedDragNever,
    PreferencesEditorNotes,
    PreferencesEditorNotesDescription,
    PreferencesEditorShowDone,
    PreferencesEditorAutoDone,
    PreferencesEditorShowStarred,
    PreferencesEditorShowTag,
    PreferencesEditorScissors,
    PreferencesEditorScissorsDescription,
    PreferencesEditorScissorsColor,
    PreferencesEditorScissorsActionTargetNone,
    PreferencesEditorScissorsActionTargetFormer,
    PreferencesEditorScissorsActionTargetLatter,
    PreferencesEditorScissorsActionGoTo,
    PreferencesEditorScissorsActionAskForName,
    PreferencesEditorScissorsActionPlay,
    PreferencesEditorAutoScroll,
    PreferencesEditorAutoScrollDescription,
    PreferencesEditorAutoScrollOnLoadedNewSample,
    PreferencesEditorAutoScrollOnJumpedToEntry,
    PreferencesEditorAutoScrollOnSwitchedInMultipleEditMode,
    PreferencesEditorAutoScrollOnSwitched,
    PreferencesEditorContinuousLabelNames,
    PreferencesEditorContinuousLabelNamesDescription,
    PreferencesEditorContinuousLabelNamesColor,
    PreferencesEditorContinuousLabelNamesSize,
    PreferencesEditorContinuousLabelNamesPosition,
    PreferencesPlayback,
    PreferencesPlaybackDescription,
    PreferencesPlaybackPlayOnDragging,
    PreferencesPlaybackPlayOnDraggingDescription,
    PreferencesPlaybackPlayOnDraggingEnabled,
    PreferencesPlaybackPlayOnDraggingRangeRadiusMillis,
    PreferencesPlaybackPlayOnDraggingEventQueueSize,
    PreferencesAutoSave,
    PreferencesAutoSaveDescription,
    PreferencesAutoSaveTarget,
    PreferencesAutoSaveTargetNone,
    PreferencesAutoSaveTargetProject,
    PreferencesAutoSaveTargetRecord,
    PreferencesAutoSaveIntervalSec,
    PreferencesHistory,
    PreferencesHistoryDescription,
    PreferencesHistoryMaxSize,
    PreferencesHistorySquashIndex,
    PreferencesHistorySquashIndexDescription,
    ActionToggleSamplePlayback,
    ActionToggleEntryPlayback,
    ActionIncreaseResolution,
    ActionDecreaseResolution,
    ActionInputResolution,
    ActionCancelDialog,
    ActionSetValue1,
    ActionSetValue2,
    ActionSetValue3,
    ActionSetValue4,
    ActionSetValue5,
    ActionSetValue6,
    ActionSetValue7,
    ActionSetValue8,
    ActionSetValue9,
    ActionSetValue10,
    ActionMoveParameter,
    ActionMoveParameterWithPlaybackPreview,
    ActionMoveParameterIgnoringConstraints,
    ActionMoveParameterInvertingLocked,
    ActionPlayAudioSection,
    ActionScrollCanvasLeft,
    ActionScrollCanvasRight,
    ActionZoomInCanvas,
    ActionZoomOutCanvas,
    ActionGoToNextEntry,
    ActionGoToPreviousEntry,
    ActionGoToNextSample,
    ActionGoToPreviousSample,
    CheckForUpdatesAlreadyUpdated,
    CheckForUpdatesFailure,
    UpdaterDialogSummaryDetailsLink,
    UpdaterDialogTitle,
    UpdaterDialogCurrentVersionLabel,
    UpdaterDialogLatestVersionLabel,
    UpdaterDialogStartDownloadButton,
    UpdaterDialogIgnoreButton,
    UpdaterDialogDownloadPositionLabel,
    UpdaterDialogChangeDownloadPositionButton,
    UpdaterDialogChooseDownloadPositionDialogTitle,
    AboutDialogTitle,
    AboutDialogCopyInfo,
    AboutDialogShowLicenses,
    LicenseDialogTitle,
    LicenseDialogLicenses,
    LoadProjectWarningLabelerCreated,
    LoadProjectWarningLabelerUpdated,
    LoadProjectWarningCacheDirReset,
    FilterStarred,
    FilterUnstarred,
    FilterStarIgnored,
    FilterDone,
    FilterUndone,
    FilterDoneIgnored,
    FilterLink,
    FilterLinked,
    ColorPickerDialogTitle,
    ;

    fun get(language: Language): String = when (language) {
        English -> en()
        ChineseSimplified -> zhHans()
        Japanese -> ja()
    } ?: en()
}

@Composable
fun string(key: Strings, vararg params: Any?): String = stringCertain(key, LocalLanguage.current, *params)

fun stringStatic(key: Strings, vararg params: Any?): String = stringCertain(key, currentLanguage, *params)

fun stringCertain(key: Strings, language: Language, vararg params: Any?): String {
    val template = key.get(language)
    return template.format(*params)
}
