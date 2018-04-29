package com.workshop.aplikasiportalberita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BeritaActivity extends AppCompatActivity {
WebView webberita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);
        String berita = getIntent().getStringExtra("url");
        webberita = (WebView)findViewById(R.id.webberita);
        webberita.getSettings().setJavaScriptEnabled(true);
        webberita.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
        webberita.loadUrl(berita);
    }
}
