package com.diegomalone.morsenotifier.feature.customization.di

import com.diegomalone.morsenotifier.data.GetApplicationListUseCase
import com.diegomalone.morsenotifier.feature.customization.presentation.AppListViewModel
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
            GetApplicationListUseCase(get())
        }
    }
}