package com.diegomalone.morsenotifier.data.usecase

import com.diegomalone.morsenotifier.data.Result.Failure
import com.diegomalone.morsenotifier.data.Result.Success
import com.diegomalone.morsenotifier.data.data
import com.diegomalone.morsenotifier.data.model.Application
import com.diegomalone.morsenotifier.data.repository.FakeAppListRepository
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

class GetApplicationListUseCaseTest {

    private val dispatcher = Dispatchers.Default

    @Test
    fun testExecuteWithEmptyList() {
        val list = listOf<Application>()
        val subject = GetApplicationListUseCase(FakeAppListRepository(list), dispatcher)
        val result = runBlocking { subject(Unit).first() }

        assertThat(result).isInstanceOf(Success::class.java)
        assertThat(result.data).containsExactlyElementsIn(list)
    }

    @Test
    fun testExecuteWithNonEmptyList() {
        val list = listOf(
            Application("app1", "package1"),
            Application("app2", "package2")
        )

        val subject = GetApplicationListUseCase(FakeAppListRepository(list), dispatcher)
        val result = runBlocking { subject(Unit).first() }

        assertThat(result).isInstanceOf(Success::class.java)
        assertThat(result.data).containsExactlyElementsIn(list)
    }

    @Test
    fun testExecuteWithException() {
        val exceptionMessage = "GetApplicationListUseCase exception"
        val subject = GetApplicationListUseCase(
            FakeAppListRepository(
                listOf(),
                exceptionMessage
            ), dispatcher
        )

        val result = runBlocking { subject(Unit).first() }

        assertThat(result).isInstanceOf(Failure::class.java)
        assertThat((result as Failure).exception).hasMessageThat().contains(exceptionMessage)
    }

}
