package com.example.android.unscramble.ui.game

import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    private var score = 0
    private var currentWordCount = 0
    private var _currentScrambledWord = "test"
    val currentScrambeldWord: String
        get() = _currentScrambledWord

    init {
        log.d("GameFragment", "GameViewModel created!")
    }
}