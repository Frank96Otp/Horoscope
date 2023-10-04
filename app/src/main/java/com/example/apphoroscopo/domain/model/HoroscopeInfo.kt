package com.example.apphoroscopo.domain.model

import com.example.apphoroscopo.R

sealed  class HoroscopeInfo(
    val img:Int,
    val name:Int
){
    object Aries:HoroscopeInfo(R.drawable.aries, R.string.aries)
    object Tauro:HoroscopeInfo(R.drawable.tauro, R.string.taurus)
    object Geminis:HoroscopeInfo(R.drawable.geminis, R.string.gemini)
    object Cancer:HoroscopeInfo(R.drawable.cancer, R.string.cancer)
    object Leo:HoroscopeInfo(R.drawable.leo, R.string.leo)
    object Virgo:HoroscopeInfo(R.drawable.virgo, R.string.virgo)
    object Libra:HoroscopeInfo(R.drawable.libra, R.string.libra)
    object Escorpio:HoroscopeInfo(R.drawable.escorpio, R.string.scorpio)
    object Sagitario:HoroscopeInfo(R.drawable.sagitario, R.string.sagittarius)
    object Capricornio:HoroscopeInfo(R.drawable.capricornio, R.string.capricorn)
    object Acuario:HoroscopeInfo(R.drawable.aquario, R.string.aquarius)
    object Piscis:HoroscopeInfo(R.drawable.piscis, R.string.pisces)
}