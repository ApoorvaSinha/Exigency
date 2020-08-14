package com.example.exigency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class AccdientLoc extends AppCompatActivity {

    WebView Accwv;
    Button reached;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accdient_loc);

        Accwv = findViewById(R.id.webview2);
        Accwv.setWebViewClient(new MyBrowser());
        Accwv.getSettings().setLoadsImagesAutomatically(true);
        Accwv.getSettings().setJavaScriptEnabled(true);
        reached=findViewById(R.id.button15);

        Accwv.loadUrl("https://www.google.com/maps/place/Bharamtoli,+Ranchi,+Jharkhand+834009/@23.4074266,85.3446094,15z/data=!3m1!4b1!4m5!3m4!1s0x39f4e154c12e46af:0xa40538abc33c635d!8m2!3d23.4072091!4d85.3510904");


        reached.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acc=new Intent(AccdientLoc.this,drivside.class);
                startActivity(acc);

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
