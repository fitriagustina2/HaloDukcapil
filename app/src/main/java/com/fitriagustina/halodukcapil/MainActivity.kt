package com.fitriagustina.halodukcapil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.fitriagustina.halodukcapil.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //variable navigation fragment untuk menampilkan ui
        val navController = findNavController(R.id.nav_host_fragment_activity_home)

        //memasangkan navController ke navView
        binding.navView.setupWithNavController(navController)
    }
}