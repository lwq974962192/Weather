package com.lu.otk.weather;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SplashActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGHT = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ImageView imageView=findViewById(R.id.splash);
        Glide.with(this).load(R.drawable.q).into(imageView);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        },SPLASH_DISPLAY_LENGHT);
    }
}
