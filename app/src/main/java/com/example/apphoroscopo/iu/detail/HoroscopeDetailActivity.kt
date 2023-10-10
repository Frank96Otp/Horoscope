package com.example.apphoroscopo.iu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.navArgs
import com.example.apphoroscopo.R
import com.example.apphoroscopo.databinding.ActivityHoroscopeDetailBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HoroscopeDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHoroscopeDetailBinding

    private val horoscopeDetailViewModel: HoroscopeDetailViewModel by viewModels()

    private val args:HoroscopeDetailActivityArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHoroscopeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        args.Type
    }
}