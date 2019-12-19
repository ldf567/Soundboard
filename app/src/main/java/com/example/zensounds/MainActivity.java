package com.example.zensounds;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer leaf,water,fire,wind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        leaf=MediaPlayer.create(MainActivity.this,R.raw.forest);
        water=MediaPlayer.create(MainActivity.this,R.raw.sea);
        fire=MediaPlayer.create(MainActivity.this,R.raw.fire);
        wind=MediaPlayer.create(MainActivity.this,R.raw.wind);
    }
    public void playleaf(View view ) {
        leaf.start();
    }
    public void playwater(View view ) {
        water.start();
    }
    public void playfire(View view ) {
        fire.start();
    }
    public void playwind(View view ) {
        wind.start();
    }
}

