package com.a21517275.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MySplash extends AppCompatActivity {
    ImageView imagen;
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_splash);
        imagen= (ImageView) findViewById(R.id.imageView);
        texto= (TextView) findViewById(R.id.textView);
        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.anim);
        imagen.startAnimation(animation);
        Typeface fuente=Typeface.createFromAsset(getAssets(),"AmaticSC-Regular.ttf");
        texto.setTypeface(fuente);
        openSplash();
    }
    private void openSplash(){
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MySplash.this,MyLogin.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}
