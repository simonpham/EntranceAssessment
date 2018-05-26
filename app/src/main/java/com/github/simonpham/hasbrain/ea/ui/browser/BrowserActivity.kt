package com.github.simonpham.hasbrain.ea.ui.browser

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebViewClient
import com.github.simonpham.hasbrain.ea.R
import kotlinx.android.synthetic.main.activity_browser.*

class BrowserActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browser)

        // enable Javascript
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true

        val url = intent.getStringExtra("MainActivity.ARTICLE_URL")
        loadUrl(url)
    }

    private fun loadUrl(url: String) {
        if (webView != null) webView.loadUrl(url)
    }
}
