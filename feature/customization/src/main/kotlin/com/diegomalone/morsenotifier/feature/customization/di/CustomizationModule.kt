package com.diegomalone.morsenotifier.feature.customization.di

import com.diegomalone.morsenotifier.feature.customization.presentation.AppListViewModel
import com.diegomalone.morsenotifier.feature.customization.repository.AppListRepository
import com.diegomalone.morsenotifier.feature.customization.repository.DeviceApplicationsRepository
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

object CustomizationModule {
    fun inject() = loadKoinModules(
        listOf(
            viewModelModule,
            repositoryModule
        )
    )

    private val viewModelModule = module {
        viewModel { AppListViewModel(get()) }
    }

    private val repositoryModule = module {
        single<AppListRepository> {
            DeviceApplicationsRepository(
                androidContext()
            )
        }
    }
}