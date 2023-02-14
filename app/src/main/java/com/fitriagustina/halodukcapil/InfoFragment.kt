package com.fitriagustina.halodukcapil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.fitriagustina.halodukcapil.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private lateinit var binding: FragmentInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //mempersiapkan untuk webview dengan menambah action jika webview selesai meload/memuat web
        binding.webView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                //jika halaman selesai dimuat maka akan menghilangkan progress bar
                binding.progressBar.visibility = View.GONE
            }
        }
        //memuat url dari website
        binding.webView.loadUrl("https://disdukcapil.bantulkab.go.id/")
        //menghidupkan javascript
        binding.webView.settings.javaScriptEnabled = true
        //setting supaya webview bisa dizoom in/out
        binding.webView.settings.setSupportZoom(true)
    }
}