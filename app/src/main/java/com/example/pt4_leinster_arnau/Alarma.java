package com.example.pt4_leinster_arnau;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Alarma extends AppCompatActivity implements View.OnClickListener {

    EditText alarmaMensaje, alarmaHora, alarmaMinuto;
    Button buttonCreate;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarmades);
        buttonCreate = (Button) findViewById(R.id.button3);
        alarmaMensaje = (EditText) findViewById(R.id.mensaje);
        alarmaHora = (EditText) findViewById(R.id.hora);
        alarmaMinuto = (EditText) findViewById(R.id.minuto);
        buttonCreate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, alarmaMensaje.getText().toString())
                .putExtra(AlarmClock.EXTRA_HOUR, Integer.parseInt(alarmaHora.getText().toString()))
                .putExtra(AlarmClock.EXTRA_MINUTES, Integer.parseInt(alarmaMinuto.getText().toString()));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
