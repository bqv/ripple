package com.diegomalone.morsenotifier.feature.customization.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.diegomalone.morsenotifier.R
import com.diegomalone.morsenotifier.feature.customization.di.CustomizationModule
import kotlinx.coroutines.InternalCoroutinesApi
import org.koin.androidx.viewmodel.ext.android.viewModel

@InternalCoroutinesApi
class AppListActivity : AppCompatActivity() {

    private val viewModel by viewModel<AppListViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_list)
        CustomizationModule.inject()
    }
}