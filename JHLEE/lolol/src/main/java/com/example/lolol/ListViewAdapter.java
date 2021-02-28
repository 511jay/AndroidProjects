package com.example.lolol;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    private ArrayList<itemJV> itemJVS = new ArrayList<itemJV>();
    public ListViewAdapter(){

    }

    @Override
    public int getCount() {
        return itemJVS.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item, parent, false);
        }

        TextView T1 = (TextView) convertView.findViewById(R.id.title);
        TextView T2 = (TextView) convertView.findViewById(R.id.dateTXT);
        TextView T3 = (TextView) convertView.findViewById(R.id.timeTXT);

        itemJV itemJS = itemJVS.get(position);

        T1.setText(itemJS.getTitle());
        T2.setText(itemJS.getDate());
        T3.setText(itemJS.getTime());

        return convertView;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    public void addItem(String title, String date, String time){
        itemJV item = new itemJV();

        item.setTitle(title);
        item.setDate(date);
        item.setTime(time);

        itemJVS.add(item);
    }
}
