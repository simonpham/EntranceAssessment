package com.github.simonpham.hasbrain.eaj.ui.browser;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.github.simonpham.hasbrain.eaj.R;

/**
 * Created by Simon Pham on 5/26/18.
 * Email: simonpham.dn@gmail.com
 */
public class BrowserActivity extends AppCompatActivity {

    private WebView vWeb = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        initialize();

        String url = getIntent().getStringExtra("MainActivity.ARTICLE_URL");
        loadUrl(url);
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void initialize() {
        vWeb = findViewById(R.id.webView);

        // enable javascript
        vWeb.setWebViewClient(new WebViewClient());
        vWeb.getSettings().setJavaScriptEnabled(true);
    }

    private void loadUrl(String url) {
        if (vWeb != null) vWeb.loadUrl(url);
    }
}
