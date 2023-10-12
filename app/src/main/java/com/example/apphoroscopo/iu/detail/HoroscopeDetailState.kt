package com.example.apphoroscopo.iu.detail

sealed class HoroscopeDetailState {

    data object  Loading:HoroscopeDetailState()
    data class Error(var error:String):HoroscopeDetailState()
    data class Success(val data:String):HoroscopeDetailState()


}