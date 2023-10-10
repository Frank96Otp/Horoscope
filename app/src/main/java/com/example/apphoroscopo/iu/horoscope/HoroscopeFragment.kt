package com.example.apphoroscopo.iu.horoscope

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.apphoroscopo.databinding.FragmentHoroscopeBinding
import com.example.apphoroscopo.domain.model.HoroscopeInfo
import com.example.apphoroscopo.domain.model.HoroscopoModel
import com.example.apphoroscopo.iu.horoscope.adapter.AdapterHoroscope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HoroscopeFragment : Fragment() {

    //conectandome al view model
    private val horoscopeViewModel by viewModels<HoroscopeViewModel>()
    private var _binding: FragmentHoroscopeBinding? = null


    //conectamos al adapter
    private lateinit var adapterHoroscope: AdapterHoroscope

    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUi()
    }

    private fun initUi() {
        initUiState()
        initList()
    }

    private fun initList() {
        adapterHoroscope = AdapterHoroscope(onItemSelect = {


            val type: HoroscopoModel =
            when(it){
                HoroscopeInfo.Acuario -> HoroscopoModel.Acuario
                HoroscopeInfo.Aries -> HoroscopoModel.Aries
                HoroscopeInfo.Cancer -> HoroscopoModel.Cancer
                HoroscopeInfo.Capricornio -> HoroscopoModel.Capricornio
                HoroscopeInfo.Escorpio -> HoroscopoModel.Escorpio
                HoroscopeInfo.Geminis ->  HoroscopoModel.Geminis
                HoroscopeInfo.Leo ->  HoroscopoModel.Leo
                HoroscopeInfo.Libra ->  HoroscopoModel.Libra
                HoroscopeInfo.Piscis ->  HoroscopoModel.Piscis
                HoroscopeInfo.Sagitario ->  HoroscopoModel.Sagitario
                HoroscopeInfo.Tauro ->  HoroscopoModel.Tauro
                HoroscopeInfo.Virgo ->  HoroscopoModel.Virgo
            }

           findNavController().navigate(
               HoroscopeFragmentDirections.actionHoroscopeFragmentToHoroscopeDetailActivity(type)
           )
        }
        )

        binding.rvHoroscope.apply {
            layoutManager = GridLayoutManager(requireContext(), 2)
            adapter = adapterHoroscope
        }


    }

    private fun initUiState() {

        lifecycleScope.launch {

            repeatOnLifecycle(Lifecycle.State.STARTED) {
                horoscopeViewModel.horoscope.collect {
                    adapterHoroscope.updateList(it)
                }
            }

        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}