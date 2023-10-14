package com.example.apphoroscopo.domain

import com.example.apphoroscopo.domain.model.HoroscopoModel
import com.example.apphoroscopo.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sing:String):PredictionModel?
}