package com.example.apphoroscopo.data.provider

import com.example.apphoroscopo.domain.model.HoroscopeInfo
import com.example.apphoroscopo.domain.model.HoroscopeInfo.Acuario
import com.example.apphoroscopo.domain.model.HoroscopeInfo.Aries
import com.example.apphoroscopo.domain.model.HoroscopeInfo.Cancer
import com.example.apphoroscopo.domain.model.HoroscopeInfo.Capricornio
import com.example.apphoroscopo.domain.model.HoroscopeInfo.Escorpio
import com.example.apphoroscopo.domain.model.HoroscopeInfo.Geminis
import com.example.apphoroscopo.domain.model.HoroscopeInfo.Leo
import com.example.apphoroscopo.domain.model.HoroscopeInfo.Libra
import com.example.apphoroscopo.domain.model.HoroscopeInfo.Piscis
import com.example.apphoroscopo.domain.model.HoroscopeInfo.Sagitario
import com.example.apphoroscopo.domain.model.HoroscopeInfo.Tauro
import com.example.apphoroscopo.domain.model.HoroscopeInfo.Virgo
import javax.inject.Inject

class HoroscopeProvider @Inject  constructor() {

    fun getHoroscope(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Tauro,
            Geminis,
            Cancer,
            Piscis,
            Libra,
            Acuario,
            Capricornio,
            Leo,
            Virgo,
            Escorpio,
            Sagitario
        )
    }
}