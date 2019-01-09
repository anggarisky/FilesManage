package com.example.anggarisky.filesmanage;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class GetStartedEmail extends AppCompatActivity {

    TextView titleGet;
    Button btngetstarted;
    Animation btt, bttdua, bttiga, imgalpha;
    ImageView imgget;
    EditText inputEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started_email);

        titleGet = (TextView) findViewById(R.id.titleGet);
        btngetstarted = (Button) findViewById(R.id.btngetstarted);
        imgget = (ImageView) findViewById(R.id.imgget);
        inputEmail = (EditText) findViewById(R.id.inputEmail);

        // import animation
        btt = AnimationUtils.loadAnimation(this, R.anim.btt);
        bttdua = AnimationUtils.loadAnimation(this, R.anim.bttdua);
        bttiga = AnimationUtils.loadAnimation(this, R.anim.bttiga);
        imgalpha = AnimationUtils.loadAnimation(this, R.anim.imgalpha);

        // set animation
        titleGet.startAnimation(btt);
        inputEmail.startAnimation(bttdua);
        btngetstarted.startAnimation(bttiga);
        imgget.startAnimation(imgalpha);

        // import font
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface Vidaloka = Typeface.createFromAsset(getAssets(), "fonts/Vidaloka.ttf");

        // customize font
        titleGet.setTypeface(Vidaloka);
        btngetstarted.setTypeface(Vidaloka);
    }
}
