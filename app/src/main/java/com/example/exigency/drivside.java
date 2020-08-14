package com.example.exigency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class drivside extends AppCompatActivity {
TextView drivernm,drvr;
WebView drvw;
Button infm;
Preferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivside);
        infm = findViewById(R.id.button13);
        drivernm = findViewById(R.id.textView18);
        drvw = findViewById(R.id.webview1);

        drvw.setWebViewClient(new MyBrowser());
        drvw.getSettings().setLoadsImagesAutomatically(true);
        drvw.getSettings().setJavaScriptEnabled(true);

        drvw.loadUrl("https://www.google.com/maps/search/hospital/@23.4074655,85.3446094,15z/data=!3m1!4b1!4m8!2m7!3m6!1shospital!2sBharamtoli,+Ranchi,+Jharkhand+834009!3s0x39f4e154c12e46af:0xa40538abc33c635d!4m2!1d85.3510904!2d23.4072091");


        preferences = new Preferences(getApplicationContext());
        drivernm.setText(preferences.getUsername());
        infm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9431896908"));
                startActivity(x);
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
