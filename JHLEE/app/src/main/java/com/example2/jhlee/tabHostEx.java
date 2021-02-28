package com.example2.jhlee;

import android.os.Bundle;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import com.example.jhlee.R;

public class tabHostEx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_host_ex);

        TabHost host = findViewById(R.id.host);
        host.setup();

        TabHost.TabSpec spec = host.newTabSpec("Tab 1");
        spec.setIndicator("tab1");
        spec.setContent(R.id.IM1);
        host.addTab(spec);

        spec=host.newTabSpec("tab2");
        spec.setIndicator(null,ResourcesCompat.getDrawable(getResources(),R.drawable.garen,null));
        spec.setContent(R.id.TS2);
        host.addTab(spec);

        spec=host.newTabSpec("tab3");
        spec.setIndicator(null,ResourcesCompat.getDrawable(getResources(),R.drawable.gangplank,null));
        spec.setContent(R.id.TS3);
        host.addTab(spec);



    }
}
