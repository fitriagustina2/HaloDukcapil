package com.fitriagustina.halodukcapil.layanan_online

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fitriagustina.halodukcapil.R
import com.fitriagustina.halodukcapil.databinding.ActivityLayananBinding

class LayananActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLayananBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLayananBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //action pada navigation toolbar (tombol back pada toolbar) untuk kembali ke halaman sebelumnya atau menyelesaikan activity ini
        binding.toolbar.setNavigationOnClickListener { finish() }

        //action saat cardview download
        binding.cvDownload.setOnClickListener {
            //memulai intent dengan action view menuju ke halaman playstore DISDUKCAPIL Smart Bantul
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=com.webpakar.dukcapil_smart_bantul")
                )
            )
        }
    }
}