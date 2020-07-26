package com.diegomalone.morsenotifier.data.repository

import android.content.Context
import com.diegomalone.morsenotifier.data.Result
import com.diegomalone.morsenotifier.data.model.Application
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class DeviceApplicationsRepository(private val context: Context) : AppListRepository {

    override fun getApplicationList(): Flow<Result<List<Application>>> {
        return flow {
            // TODO Get real application list
            emit(
                Result.Success(listOf<Application>())
            )
        }
    }
}