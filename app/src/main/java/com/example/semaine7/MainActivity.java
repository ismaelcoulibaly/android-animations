package com.example.semaine7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1;
    private ImageView image1;
    private ImageView image2;
    private Button button2;
    private TextView textv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = findViewById(R.id.imageView);
        image2 = findViewById(R.id.imageView2);
        button1 = (Button) findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        textv = (TextView) findViewById(R.id.tv1);
        button1.setOnClickListener(this);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image2.setBackgroundResource(R.drawable.animation2);
                AnimationDrawable anim = (AnimationDrawable) image2.getBackground();
                anim.start();
            }
        });

    }

    @Override
    public void onClick(View v) {
        image1.setBackgroundResource(R.drawable.animation);
        AnimationDrawable anim = (AnimationDrawable) image1.getBackground();
        anim.start();

        Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.anim);
        textv.startAnimation(myAnim);

    }

}