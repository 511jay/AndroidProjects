package com.example.jhlee;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class click_jjanEX extends AppCompatActivity implements View.OnClickListener{

    Button trueBtn;
    Button falseBtn;
    TextView targetTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_ex2);

        trueBtn=findViewById(R.id.btn_visible_true);
        falseBtn=findViewById(R.id.btn_visible_fls);
        targetTextView=findViewById(R.id.text_visible_target);

        trueBtn.setOnClickListener(this);
        falseBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v==trueBtn){
            targetTextView.setVisibility(View.VISIBLE);
        }
        else if(v==falseBtn){
            targetTextView.setVisibility(View.INVISIBLE);
        }
    }
}
