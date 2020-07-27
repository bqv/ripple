package com.diegomalone.morsenotifier.data.repository

import com.diegomalone.morsenotifier.data.Result
import com.diegomalone.morsenotifier.data.model.Application
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FakeAppListRepository(
    private val applicationList: List<Application>,
    private val exceptionMessage: String? = null
) : AppListRepository {
    override fun getApplicationList(): Flow<Result<List<Application>>> =
        flow {
            exceptionMessage?.let { throw Exception(it) }
            emit(Result.Success(applicationList))
        }
}