package com.diegomalone.morsenotifier.feature.customization.di

import com.diegomalone.morsenotifier.data.repository.DeviceApplicationsRepository
import com.diegomalone.morsenotifier.data.usecase.GetApplicationListUseCase
import com.diegomalone.morsenotifier.feature.customization.presentation.AppListViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

object CustomizationModule {
    fun inject() = loadKoinModules(
        listOf(
            viewModelModule,
            useCaseModule
        )
    )

    private val viewModelModule = module {
        viewModel { AppListViewModel(get()) }
    }

    private val useCaseModule = module {
        single {
            // TODO Inject ApplicationRepository dependency
            GetApplicationListUseCase(DeviceApplicationsRepository(androidApplication()))
        }
    }
}