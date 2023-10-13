package com.example.apphoroscopo.domain

interface Repository {
    suspend fun getPrediction(sing:String)
}