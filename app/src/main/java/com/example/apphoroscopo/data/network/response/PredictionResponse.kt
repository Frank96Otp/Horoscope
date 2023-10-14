package com.example.apphoroscopo.data.network.response

import com.example.apphoroscopo.domain.model.PredictionModel
import com.google.gson.annotations.SerializedName

data class PredictionResponse(

    @SerializedName("date") val date:String,
    @SerializedName("horoscope") val horoscope:String,
    @SerializedName("sing") val sing:String

) {
    fun toDomain():PredictionModel{
        return PredictionModel(
            horoscope = horoscope,
            sign = sing
        )
    }
}