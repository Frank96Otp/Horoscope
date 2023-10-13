package com.example.apphoroscopo.data

import com.example.apphoroscopo.data.network.HoroscopeApiService
import com.example.apphoroscopo.domain.Repository
import retrofit2.Retrofit
import javax.inject.Inject


class RepositoryImpl @Inject constructor(private  val apiService: HoroscopeApiService):Repository {
    override suspend fun getPrediction(sing: String) {
        kotlin.runCatching {
            
        }
    }
}