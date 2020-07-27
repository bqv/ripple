package com.diegomalone.morsenotifier.data.usecase

import com.diegomalone.morsenotifier.data.FlowUseCase
import com.diegomalone.morsenotifier.data.Result
import com.diegomalone.morsenotifier.data.model.Application
import com.diegomalone.morsenotifier.data.repository.AppListRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetApplicationListUseCase(
    private val appListRepository: AppListRepository,
    dispatcher: CoroutineDispatcher
) : FlowUseCase<Unit, List<Application>>(dispatcher) {

    override fun execute(params: Unit): Flow<Result<List<Application>>> {
        return appListRepository.getApplicationList().map { observableResult ->
            when (observableResult) {
                is Result.Success -> Result.Success(observableResult.data)
                is Result.Failure -> observableResult
                is Result.Loading -> Result.Failure(IllegalStateException("Result must be Success or Error"))
            }
        }
    }
}