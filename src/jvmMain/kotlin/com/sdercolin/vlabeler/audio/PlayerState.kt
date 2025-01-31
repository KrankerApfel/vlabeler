package com.sdercolin.vlabeler.audio

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class PlayerState {

    var isPlaying: Boolean by mutableStateOf(false)
        private set

    var framePosition: Float? by mutableStateOf(null)
        private set

    var lastStartedFrame: Long? = null
        private set

    fun startPlaying(startFrame: Long = 0) {
        lastStartedFrame = startFrame
        isPlaying = true
        framePosition = null
    }

    fun stopPlaying() {
        lastStartedFrame = null
        isPlaying = false
        framePosition = null
    }

    fun setFramePosition(position: Float) {
        framePosition = position
    }
}
