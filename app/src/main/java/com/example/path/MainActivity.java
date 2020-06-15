package com.example.path;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button b1, b2, b3, b4;
    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Animation rotate = AnimationUtils.loadAnimation(this,
                R.anim.anim_rotate);
        final Animation translate = AnimationUtils.loadAnimation(this,
                R.anim.anim_translate);
        final Animation scale = AnimationUtils.loadAnimation(this,
                R.anim.anim_scale);
        final Animation alpha = AnimationUtils.loadAnimation(this,
                R.anim.anim_alpha);
        final ImageView iv = (ImageView) findViewById(R.id.imageview);

        b1 = (Button) findViewById(R.id.btnAlpha);

        b2 = (Button) findViewById(R.id.btnRotate);

        b3 = (Button) findViewById(R.id.btnScale);

        b4 = (Button) findViewById(R.id.btnTranslate);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag) {
                    iv.startAnimation(alpha);

                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (flag) {
                    iv.startAnimation(rotate);

                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (flag) {
                    iv.startAnimation(scale);

                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (flag) {
                    iv.startAnimation(translate);

                }
            }
        });
    }

    private class OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

        }
    }
}