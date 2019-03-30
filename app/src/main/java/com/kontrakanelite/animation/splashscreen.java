package com.kontrakanelite.animation;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class splashscreen extends AppCompatActivity {

    private ImageView logo;
    private RelativeLayout cityTop, cityBottom;
    private Animation upToDown, downToUp, fade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        //init views
        logo = findViewById(R.id.logo);
        cityTop = findViewById(R.id.cityTop);
        cityBottom = findViewById(R.id.cityBottom);

        //set up animation
        upToDown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        downToUp = AnimationUtils.loadAnimation(this, R.anim.downtoup);
        fade = AnimationUtils.loadAnimation(this, R.anim.fadein);
        cityTop.setAnimation(upToDown);
        cityBottom.setAnimation(downToUp);
        logo.setAnimation(fade);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(splashscreen.this,loginPage.class);
                startActivity(intent);
                finish();
            }
        },5000);

    }

}
