package com.example.anggarisky.filesmanage;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titleGet, subtitleGet;
    Button btngetstarted;
    Animation btt, bttdua, bttiga, imgalpha;
    ImageView imgget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // import animation
        btt = AnimationUtils.loadAnimation(this, R.anim.btt);
        bttdua = AnimationUtils.loadAnimation(this, R.anim.bttdua);
        bttiga = AnimationUtils.loadAnimation(this, R.anim.bttiga);
        imgalpha = AnimationUtils.loadAnimation(this, R.anim.imgalpha);

        titleGet = (TextView) findViewById(R.id.titleGet);
        subtitleGet = (TextView) findViewById(R.id.subtitleGet);
        btngetstarted = (Button) findViewById(R.id.btngetstarted);
        imgget = (ImageView) findViewById(R.id.imgget);

        // set animation
        titleGet.startAnimation(btt);
        subtitleGet.startAnimation(bttdua);
        btngetstarted.startAnimation(bttiga);
        imgget.startAnimation(imgalpha);


        // import font
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface Vidaloka = Typeface.createFromAsset(getAssets(), "fonts/Vidaloka.ttf");

        // customize font
        titleGet.setTypeface(Vidaloka);
        btngetstarted.setTypeface(Vidaloka);
        subtitleGet.setTypeface(MLight);

        btngetstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,GetStartedEmail.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

    }
}
