package com.diegomalone.morsenotifier.data.repository

import android.content.Context
import com.diegomalone.morsenotifier.data.model.Application

class DeviceApplicationsRepository(private val context: Context) : AppListRepository {

    override fun getApplicationList(): List<Application> {
        TODO("Not yet implemented")
    }
}