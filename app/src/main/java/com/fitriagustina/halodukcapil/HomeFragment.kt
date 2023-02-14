package com.fitriagustina.halodukcapil

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fitriagustina.halodukcapil.aduan.AduanActivity
import com.fitriagustina.halodukcapil.antrian_online.AntrianActivity
import com.fitriagustina.halodukcapil.databinding.FragmentHomeBinding
import com.fitriagustina.halodukcapil.layanan_online.LayananActivity

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //aksi saat cardview aduan di klik
        binding.cvAduan.setOnClickListener {
            //intent menuju ke halaman AduanActivity
            startActivity(Intent(requireContext(), AduanActivity::class.java))
        }

        //aksi saat cardview layanan online di klik
        binding.cvLayananOnline.setOnClickListener {
            //intent menuju ke halaman LayananActivity
            startActivity(Intent(requireContext(), LayananActivity::class.java))
        }

        //aksi saat cardview antrian online di klik
        binding.cvAntrianOnline.setOnClickListener {
            //intent menuju ke halaman AntrianActivity
            startActivity(Intent(requireContext(), AntrianActivity::class.java))
        }
    }
}