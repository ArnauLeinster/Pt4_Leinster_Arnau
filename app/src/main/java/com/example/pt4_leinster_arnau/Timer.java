package com.example.pt4_leinster_arnau;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Timer extends AppCompatActivity implements View.OnClickListener {
    EditText timerMensaje, timerTemps;
    Button buttonCreateT;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timerdes);
        buttonCreateT = (Button) findViewById(R.id.button4);
        timerMensaje = (EditText) findViewById(R.id.textView);
        timerTemps = (EditText) findViewById(R.id.textView2);
        buttonCreateT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_TIMER)
                .putExtra(AlarmClock.EXTRA_MESSAGE, timerMensaje.getText().toString())
                .putExtra(AlarmClock.EXTRA_LENGTH, Integer.parseInt(timerTemps.getText().toString()))
                .putExtra(AlarmClock.EXTRA_SKIP_UI, false);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}
