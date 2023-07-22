package com.hoest.completewebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView2: CompleteWebView = findViewById(R.id.webView22)
        webView2.loadUrl("https://cgi-lib.berkeley.edu/ex/fup.html")




    }
}