package com.realityexpander.daggerscopes

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SessionTimer {

    private var isRunning = false
    var sessionTime = 0

    fun startTimer() {
        CoroutineScope(Dispatchers.Main).launch {
            while(isRunning) {
                delay(1000L)
                sessionTime++
            }
        }
    }

    fun stopTimer() {
        isRunning = false
        sessionTime = 0
    }
}