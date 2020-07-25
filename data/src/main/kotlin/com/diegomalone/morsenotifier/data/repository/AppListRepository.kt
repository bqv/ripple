package com.diegomalone.morsenotifier.data.repository

import com.diegomalone.morsenotifier.data.RequestError
import com.diegomalone.morsenotifier.data.Result
import com.diegomalone.morsenotifier.data.model.ApplicationList

interface AppListRepository {

    fun getApplicationList(): Result<ApplicationList, RequestError>
}