package com.discitex.nurtaniomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoSplash2Activity extends AppCompatActivity {
    private Button nextButton, skipButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_splash2);
        nextButton = findViewById(R.id.btn_next);
        skipButton = findViewById(R.id.btn_skip);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoSplash2Activity.this, InfoSplash3Activity.class);
                startActivity(intent);
            }
        });
        skipButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoSplash2Activity.this, LoginActivity.class);
                startActivity(intent);
            }
        }));
    }
}