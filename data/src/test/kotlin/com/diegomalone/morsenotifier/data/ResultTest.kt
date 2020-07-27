package com.diegomalone.morsenotifier.data

import androidx.lifecycle.MutableLiveData
import com.diegomalone.morsenotifier.data.Result.Failure
import com.diegomalone.morsenotifier.data.Result.Loading
import com.diegomalone.morsenotifier.data.Result.Success
import com.google.common.truth.Truth.assertThat
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

class ResultTest {

    @Test
    fun testSucceeded() {
        assertThat(Success("success").succeeded).isTrue()

        assertThat(Success(null).succeeded).isFalse()
        assertThat(Failure(Exception()).succeeded).isFalse()
        assertThat(Loading.succeeded).isFalse()
    }

    @Test
    fun testSuccessOr() {
        assertThat(Success("success").successOr("fallback"))
            .isEqualTo("success")
        assertThat(Success(null).successOr("fallback"))
            .isEqualTo("fallback")

        assertThat(Failure(Exception()).successOr("fallback"))
            .isEqualTo("fallback")
        assertThat(Loading.successOr("fallback"))
            .isEqualTo("fallback")
    }

    @Test
    fun testData() {
        assertThat(Success("success").data).isEqualTo("success")
        assertThat(Success<String?>(null).data).isNull()

        val failureResult: Result<String> = Failure(Exception())
        assertThat(failureResult.data).isNull()

        val loadingResult: Result<String> = Loading
        assertThat(loadingResult.data).isNull()
    }

    @Test
    fun testUpdateOnSuccessWithSuccess() {
        val liveData: MutableLiveData<String> = mockk(relaxed = true)

        Success("success").updateOnSuccess(liveData)

        verify {
            liveData.value = "success"
        }
    }

    @Test
    fun testUpdateOnSuccessWithSuccessAndNullData() {
        val liveData: MutableLiveData<String?> = mockk(relaxed = false)

        Success<String?>(null).updateOnSuccess(liveData)
    }

    @Test
    fun testUpdateOnSuccessWithFailure() {
        val liveData: MutableLiveData<String> = mockk(relaxed = false)

        Failure(Exception()).updateOnSuccess(liveData)
    }

    @Test
    fun testUpdateOnSuccessWithLoading() {
        val liveData: MutableLiveData<String> = mockk(relaxed = false)

        Loading.updateOnSuccess(liveData)
    }
}