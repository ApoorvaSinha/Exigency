package com.example.exigency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class useside extends AppCompatActivity {
Button viw;
WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_useside);
        viw=findViewById(R.id.button14);
        wv=findViewById(R.id.webview);

        wv.setWebViewClient(new MyBrowser());
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.getSettings().setJavaScriptEnabled(true);

        wv.loadUrl("https://www.google.com/maps/place/Bharamtoli,+Ranchi,+Jharkhand+834009/@23.4074266,85.3446094,15z/data=!3m1!4b1!4m5!3m4!1s0x39f4e154c12e46af:0xa40538abc33c635d!8m2!3d23.4072091!4d85.3510904");



viw.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent dver=new Intent(useside.this,selectdriver.class);
        startActivity(dver);

    }
});
    }
    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
