package com.diegomalone.morsenotifier.feature.customization.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.diegomalone.morsenotifier.data.CoroutinesViewModel
import com.diegomalone.morsenotifier.data.RequestError
import com.diegomalone.morsenotifier.data.Result
import com.diegomalone.morsenotifier.data.model.ApplicationList
import com.diegomalone.morsenotifier.data.usecase.GetApplicationListUseCase
import kotlinx.coroutines.channels.ReceiveChannel

class AppListViewModel(
    private val getApplicationListUseCase: GetApplicationListUseCase
) : CoroutinesViewModel() {

    override val receiveChannel: ReceiveChannel<Result<Any, RequestError>>
        get() = getApplicationListUseCase.receiveChannel

    private val _applicationsLiveData = MutableLiveData<ApplicationList>()
    val applicationsLiveData: LiveData<ApplicationList>
        get() = _applicationsLiveData

    fun getApplicationList() {
        getApplicationListUseCase(Unit)
    }

    override fun resolve(value: Result<Any, RequestError>) {
        value.handleResult(::handleSuccess, ::handleFailure, ::handleLoading)
    }

    private fun handleSuccess(applicationList: Any) {
        (applicationList as? ApplicationList)?.let {
            _applicationsLiveData.postValue(applicationList)
        } ?: handleFailure(RequestError.GenericError)
    }

    private fun handleLoading(state: Result.State) {
        TODO()
    }

    private fun handleFailure(requestError: RequestError) {
        TODO()
    }
}