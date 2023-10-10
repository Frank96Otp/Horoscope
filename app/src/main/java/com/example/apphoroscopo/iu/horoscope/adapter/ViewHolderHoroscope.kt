package com.example.apphoroscopo.iu.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.example.apphoroscopo.databinding.ItemHoroscopeBinding
import com.example.apphoroscopo.domain.model.HoroscopeInfo

class ViewHolderHoroscope(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo, onItemSelect: (HoroscopeInfo) -> Unit) {
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvNameHoroscope.text = binding.tvNameHoroscope.context.getString(horoscopeInfo.name)

        binding.parent.setOnClickListener{

            startRotationAnimation(binding.ivHoroscope , newLambda = { onItemSelect(horoscopeInfo)})

        }


    }


    fun startRotationAnimation(view:View, newLambda:()->Unit){
        view.animate().apply {
            duration = 500
            interpolator = LinearInterpolator()
            rotationBy(360f)
            withEndAction { newLambda()  }
            start()
        }
    }

}