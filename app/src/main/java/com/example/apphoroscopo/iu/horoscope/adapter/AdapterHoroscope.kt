package com.example.apphoroscopo.iu.horoscope.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apphoroscopo.R
import com.example.apphoroscopo.domain.model.HoroscopeInfo

class AdapterHoroscope(
    private var horoscopeList: List<HoroscopeInfo> = emptyList(),
    private val onItemSelect: (HoroscopeInfo) -> Unit
                      ) : RecyclerView.Adapter<ViewHolderHoroscope>() {


    fun updateList(list: List<HoroscopeInfo>) {
        horoscopeList = list
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderHoroscope {

        return ViewHolderHoroscope(
            LayoutInflater.from(parent.context).inflate(R.layout.item_horoscope, parent, false)
        )
    }

    override fun getItemCount() = horoscopeList.size

    override fun onBindViewHolder(holder: ViewHolderHoroscope, position: Int) {
        holder.render(horoscopeList[position]  , onItemSelect)
    }


}