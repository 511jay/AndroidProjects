package com.example.lolol;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StartView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_view);

        Button A = (Button)findViewById(R.id.optionB);
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OptionView.class);
               startActivity(intent);
            }
        });

        Button B = (Button)findViewById(R.id.feedB);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(getApplicationContext(), "배식완료", Toast.LENGTH_SHORT).show();
            }
        });

        Button C = (Button)findViewById(R.id.timeB);
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReservationView.class);
                startActivity(intent);
            }
        });

        Button D = (Button)findViewById(R.id.stateB);
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), StateView.class);
                startActivity(intent);
            }
        });

    }
}
