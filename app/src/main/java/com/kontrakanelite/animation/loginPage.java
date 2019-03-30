package com.kontrakanelite.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class loginPage extends AppCompatActivity {
    private ImageView logo;
    private LinearLayout linearLayout;
    private Animation downToUp, upToDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        //init views
        logo = findViewById(R.id.logo);
        linearLayout = findViewById(R.id.linearLayout);

        //set up animation
        upToDown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        downToUp = AnimationUtils.loadAnimation(this, R.anim.downtoup);

        logo.setAnimation(upToDown);
        linearLayout.setAnimation(downToUp);
    }
}
