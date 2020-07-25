package com.diegomalone.morsenotifier.feature.customization.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diegomalone.morsenotifier.data.Result
import com.diegomalone.morsenotifier.data.model.Application
import com.diegomalone.morsenotifier.data.successOr
import com.diegomalone.morsenotifier.data.usecase.GetApplicationListUseCase
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@InternalCoroutinesApi
class AppListViewModel(
    private val getApplicationListUseCase: GetApplicationListUseCase
) : ViewModel() {

    private val _applicationsLiveData = MutableLiveData<List<Application>>()
    val applicationsLiveData: LiveData<List<Application>>
        get() = _applicationsLiveData

    fun getApplicationList() {
        viewModelScope.launch {
            // TODO Remove internal collect method call
            getApplicationListUseCase(Unit).collect {
                process(it)
            }
        }
    }

    private fun process(result: Result<List<Application>>) {
        if (result is Result.Loading) {
            TODO("Show loading")
            return
        }

        _applicationsLiveData.value = result.successOr(emptyList())
    }
}