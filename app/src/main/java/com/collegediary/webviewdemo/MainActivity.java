package com.collegediary.webviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView1, webView2;
    private String url1 = "https://www.facebook.com/rrcollegediary";
    private String url2 = "https://www.google.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView1 = findViewById(R.id.web_view_1);
        webView2 = findViewById(R.id.web_view_2);

        webView1.setWebViewClient(new MyBrowser());
        webView1.getSettings().setLoadsImagesAutomatically(true);
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView1.loadUrl(url1);

        webView2.setWebViewClient(new MyBrowser());
        webView2.getSettings().setLoadsImagesAutomatically(true);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView2.loadUrl(url2);


    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
