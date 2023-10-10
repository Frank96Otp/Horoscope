package com.example.apphoroscopo.iu.horoscope

import androidx.lifecycle.ViewModel
import com.example.apphoroscopo.data.provider.HoroscopeProvider
import com.example.apphoroscopo.domain.model.HoroscopeInfo
import com.example.apphoroscopo.domain.model.HoroscopeInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
import javax.inject.Scope


@HiltViewModel
class HoroscopeViewModel @Inject constructor( horoscopeProvider: HoroscopeProvider) : ViewModel(){

    private  var  _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())

    val horoscope:StateFlow<List<HoroscopeInfo>> = _horoscope


    init {

        _horoscope.value =  horoscopeProvider.getHoroscope()
    }


}