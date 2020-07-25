package com.diegomalone.morsenotifier.feature.customization.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.diegomalone.morsenotifier.data.GetApplicationListUseCase

class AppListViewModel(private val getApplicationListUseCase: GetApplicationListUseCase) : ViewModel() {

    private val _applicationsLiveData = MutableLiveData<Unit>()
    val applicationsLiveData: LiveData<Unit>
        get() = _applicationsLiveData

    fun getApplicationList() {
        TODO()
    }
}