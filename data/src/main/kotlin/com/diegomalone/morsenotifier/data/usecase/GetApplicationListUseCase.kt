package com.diegomalone.morsenotifier.data.usecase

import com.diegomalone.morsenotifier.data.Result
import com.diegomalone.morsenotifier.data.UseCase
import com.diegomalone.morsenotifier.data.model.ApplicationList
import com.diegomalone.morsenotifier.data.repository.AppListRepository

class GetApplicationListUseCase(
    private val appListRepository: AppListRepository
) : UseCase<Unit, ApplicationList>() {

    override suspend fun run(params: Unit) {
        resultChannel.send(Result.State.Loading)

        val applicationResult = appListRepository.getApplicationList()
        resultChannel.send(applicationResult)

        applicationResult.handleResult {
            startAsync {
                resultChannel.send(Result.State.Loaded)
            }
        }
    }
}