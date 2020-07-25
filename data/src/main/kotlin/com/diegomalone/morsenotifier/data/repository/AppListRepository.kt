package com.diegomalone.morsenotifier.data.repository

import com.diegomalone.morsenotifier.data.Result
import com.diegomalone.morsenotifier.data.model.Application
import kotlinx.coroutines.flow.Flow

interface AppListRepository {

    fun getApplicationList(): Flow<Result<List<Application>>>
}