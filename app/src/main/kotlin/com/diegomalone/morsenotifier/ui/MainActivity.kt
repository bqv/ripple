package com.diegomalone.morsenotifier.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.diegomalone.morsenotifier.feature.customization.AppListActivity

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(Intent(this, AppListActivity::class.java))
    }
}