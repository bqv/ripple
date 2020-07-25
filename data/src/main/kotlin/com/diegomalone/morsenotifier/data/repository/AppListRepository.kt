package com.diegomalone.morsenotifier.data.repository

import com.diegomalone.morsenotifier.data.model.Application

interface AppListRepository {

    fun getApplicationList(): List<Application>
}