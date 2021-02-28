package com.example.lolol;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ReservationView extends AppCompatActivity {
    private static ListView listView;
    private ListViewAdapter adapter=  new ListViewAdapter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_view);

        Button addB = (Button)findViewById(R.id.add);
        Button delB = (Button)findViewById(R.id.delete);
        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
        AddItemInList("1", "2", "3");


        addB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NewActivity.class);
                AddItemInList("1", "2", "3");
                startActivity(intent);
            }
        });

        delB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }//onCreate

    public void AddItemInList(String title, String date, String time){
        adapter.addItem(title, date, time);
        adapter.notifyDataSetChanged();
    }

}

