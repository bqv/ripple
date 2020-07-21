package com.diegomalone.morsenotifier

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MorseNotifierApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        configureKoin()
    }

    private fun configureKoin() {
        startKoin {
            androidContext(this@MorseNotifierApplication)
        }
    }
}