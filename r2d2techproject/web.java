package com.example.r2d2techproject;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        WebView w;
        w=findViewById(R.id.w1);
        Bundle e=this.getIntent().getExtras();
        if(e!=null)
        {
            String s2=e.getString("key");
            String s3="https://en.wikipedia.org/wiki/"+s2;
            w.getSettings().setLoadsImagesAutomatically(true);
            w.getSettings().setJavaScriptEnabled(true);
            w.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            w.loadUrl(s3);
        }
    }
}
