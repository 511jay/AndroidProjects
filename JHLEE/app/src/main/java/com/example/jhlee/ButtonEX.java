package com.example.jhlee;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
//#1 버튼 만들기


public class ButtonEX extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linear = new LinearLayout(this);

        Button btn= new Button(this);
        btn.setText("A");

        linear.addView(btn);

        Button btn2= new Button(this);
        btn2.setText("B");
        linear.addView(btn2);

        Button btn3= new Button(this);
        btn3.setText("C");
        linear.addView(btn3);

        setContentView(linear);
    }


}
