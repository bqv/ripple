package com.diegomalone.morsenotifier.feature.customization

import android.app.Activity
import android.os.Bundle
import com.diegomalone.morsenotifier.R

class AppListActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_list)
    }
}