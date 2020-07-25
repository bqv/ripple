package com.diegomalone.morsenotifier.data.repository

import android.content.Context
import com.diegomalone.morsenotifier.data.RequestError
import com.diegomalone.morsenotifier.data.Result
import com.diegomalone.morsenotifier.data.model.ApplicationList

class DeviceApplicationsRepository(private val context: Context) : AppListRepository {

    override fun getApplicationList(): Result<ApplicationList, RequestError> {
        // TODO Get real application list
        return Result.Success(ApplicationList(listOf()))
    }
}