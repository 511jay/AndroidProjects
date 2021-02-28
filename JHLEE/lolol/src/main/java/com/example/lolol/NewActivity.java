package com.example.lolol;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {

    private  TextView txt;
    private DatePickerDialog.OnDateSetListener callback;
    private  TextView txt2;
    private TimePickerDialog.OnTimeSetListener callback2;
    private String DateData;
    private String TimeData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        this.InitializeView();
        this.InitializeListener();
        this.InitializeTimeView();
        this.InitializeTimeListener();
        final itemAdd itemAdd = new itemAdd();
        Button dateB = (Button)findViewById(R.id.addDate);
        Button timeB =(Button)findViewById(R.id.addTime);
        Button addB = (Button)findViewById(R.id.checked);

        dateB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               OnClickHandler(v);
            }
        });

        timeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               OnClickTime(v);
            }
        });

        addB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemAdd.add3("1", getDate(), getTime());
                Intent intent = new Intent(getApplicationContext(), ReservationView.class);
                startActivity(intent);

            }
        });


    }///oncreate

    public void InitializeView(){
        txt = (TextView)findViewById(R.id.date123);
    }

    public void InitializeListener(){
        callback = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                txt.setText(year + "년 "+ month+"월 "+ dayOfMonth+"일 ");
                String str = year+Integer.toString(month)+dayOfMonth;
                SetDateData(str);
            }
        };
    }

    public void OnClickHandler(View view){
        DatePickerDialog dialog = new DatePickerDialog(this, callback, 2019, 5, 24);
        dialog.show();
    }

    public void InitializeTimeView(){
        txt2 = (TextView)findViewById(R.id.time123);
    }
    public void InitializeTimeListener(){
        callback2 = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                txt2.setText(hourOfDay+"시 "+minute+"분");
                String str = Integer.toString(hourOfDay)+minute;
                SetTimeData(str);
            }
        };
    }

    public void OnClickTime(View view){
        TimePickerDialog ttt = new TimePickerDialog(this, callback2, 12, 5, false);
        ttt.show();
    }

    public void SetDateData(String str){
        DateData = str;
    }

    public void SetTimeData(String str){
        TimeData = str;
    }

    public String getDate(){
        return DateData;
    }

    public String getTime(){
        return TimeData;
    }

}
