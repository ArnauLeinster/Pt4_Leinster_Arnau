package com.example.pt4_leinster_arnau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonAlarm = (Button) findViewById(R.id.button);
        Button buttonTimer = (Button) findViewById(R.id.button2);
        buttonAlarm.setOnClickListener(this);
        buttonTimer.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent;

        if (v == findViewById(R.id.button)) {
            intent = new Intent(this, Alarma.class);
        } else if (v == findViewById(R.id.button2)) {
            intent = new Intent(this, Timer.class);
        } else {
            intent = null;
        }
        startActivity(intent);
    }
}