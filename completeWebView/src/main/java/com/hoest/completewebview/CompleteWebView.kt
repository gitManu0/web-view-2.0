package com.hoest.completewebview

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.content.ContextCompat.startActivity

class CompleteWebView(context1: Context, attrs: AttributeSet?) : WebView(context1, attrs) {



    init {
        val webSettings: WebSettings= settings
        webSettings.apply {
            javaScriptEnabled=true
            loadsImagesAutomatically=true

            cacheMode=WebSettings.LOAD_CACHE_ELSE_NETWORK
            scrollBarStyle= View.SCROLLBARS_INSIDE_OVERLAY
            domStorageEnabled=true
            allowFileAccess=true
            javaScriptCanOpenWindowsAutomatically=true
        }
    }

    override fun loadUrl(url: String) {
        super.loadUrl(url)
        this.webViewClient=MyWebViewClient()

    }

    private class MyWebViewClient() : WebViewClient() {

        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            return false
        }

        override fun onReceivedError(
            view: WebView?,
            request: WebResourceRequest?,
            error: WebResourceError?
        ) {
            super.onReceivedError(view, request, error)
            Log.i("HostUrlError",error.toString())

        }
    }


}