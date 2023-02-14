package com.fitriagustina.halodukcapil.aduan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fitriagustina.halodukcapil.R
import com.fitriagustina.halodukcapil.databinding.ActivityAduanBinding

class AduanActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAduanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAduanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //action pada navigation toolbar (tombol back pada toolbar) untuk kembali ke halaman sebelumnya atau menyelesaikan activity ini
        binding.toolbar.setNavigationOnClickListener { finish() }
    }
}