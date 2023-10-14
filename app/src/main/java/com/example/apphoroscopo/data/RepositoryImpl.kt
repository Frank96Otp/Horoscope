package com.example.apphoroscopo.data

import android.util.Log
import com.example.apphoroscopo.data.network.HoroscopeApiService
import com.example.apphoroscopo.data.network.response.PredictionResponse
import com.example.apphoroscopo.domain.Repository
import com.example.apphoroscopo.domain.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject


class RepositoryImpl @Inject constructor(private  val apiService: HoroscopeApiService):Repository {
    override suspend fun getPrediction(sing: String):PredictionModel? {
        runCatching { apiService.getHoroscope(sing) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("frank" ,"Ha ocurrido un error ${it.message}") }

            return  null
    }
}