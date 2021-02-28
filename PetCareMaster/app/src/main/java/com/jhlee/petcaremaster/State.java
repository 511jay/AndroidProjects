package com.jhlee.petcaremaster;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class State extends AppCompatActivity {

    BarChart Bchart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);

        Bchart = (BarChart)findViewById(R.id.chart);

        ArrayList NoOfEmp = new ArrayList();

        NoOfEmp.add(new BarEntry(945f, 0));
        NoOfEmp.add(new BarEntry(1040f, 1));
        NoOfEmp.add(new BarEntry(1133f, 2));
        NoOfEmp.add(new BarEntry(1240f, 3));
        NoOfEmp.add(new BarEntry(1369f, 4));
        NoOfEmp.add(new BarEntry(1487f, 5));
        NoOfEmp.add(new BarEntry(1501f, 6));
        NoOfEmp.add(new BarEntry(1645f, 7));
        NoOfEmp.add(new BarEntry(1578f, 8));
        NoOfEmp.add(new BarEntry(1695f, 9));

        ArrayList year = new ArrayList();

        year.add("2008");
        year.add("2009");
        year.add("2010");
        year.add("2011");
        year.add("2012");
        year.add("2013");
        year.add("2014");
        year.add("2015");
        year.add("2016");
        year.add("2017");

        BarDataSet bardataset = new BarDataSet(NoOfEmp, "No Of Employee");
        Bchart.animateY(5000);
        BarData data = new BarData(year, bardataset);
        bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        Bchart.setData(data);


    }


    /*private ArrayList<RadarEntry> dataValue(){
        ArrayList<RadarEntry> dataVals = new ArrayList<>();
        dataVals.add(new RadarEntry(1));
        dataVals.add(new RadarEntry(2));
        dataVals.add(new RadarEntry(3));
        dataVals.add(new RadarEntry(4));
        dataVals.add(new RadarEntry(5));
        dataVals.add(new RadarEntry(6));
        dataVals.add(new RadarEntry(7));
        dataVals.add(new RadarEntry(9));
        dataVals.add(new RadarEntry(10));
        return  dataVals;
    }

    private void makeChart(){
        RadarDataSet dataSet = new RadarDataSet(dataValue(), "DATA");
        dataSet.setColor(Color.BLUE);

        RadarData data = new RadarData();
        data.addDataSet(dataSet);
        String[] labels =  {"대형마트", "편의점", "학교", "학원", "지하철", "은행", "병원", "약국", "카페"};
        XAxis xAxis = Rchart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(labels));
        Rchart.setData(data);
    }*/
}
