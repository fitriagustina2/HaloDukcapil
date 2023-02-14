package com.fitriagustina.halodukcapil.antrian_online

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fitriagustina.halodukcapil.R
import com.fitriagustina.halodukcapil.databinding.ActivityAntrianBinding

class AntrianActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAntrianBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAntrianBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //action pada navigation toolbar (tombol back pada toolbar) untuk kembali ke halaman sebelumnya atau menyelesaikan activity ini
        binding.toolbar.setNavigationOnClickListener { finish() }

        //action saat cardview download
        binding.cvDownload.setOnClickListener {
            //memulai intent dengan action view menuju ke halaman playstore Antrian Capil Bantul
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=com.kodular.canalldev.antrianonline")
                )
            )
        }
    }
}