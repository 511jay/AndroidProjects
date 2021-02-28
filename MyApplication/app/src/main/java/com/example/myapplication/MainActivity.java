package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button menu;
    Button item;
    Button quest;
    Button event;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = (Button)findViewById(R.id.move_menu);
        item = (Button)findViewById(R.id.move_item);
        quest = (Button)findViewById(R.id.move_quest);
        event = (Button)findViewById(R.id.move_event);

    }
}