package com.example.suruku_calendar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity5 extends Activity {

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calevent);
        
        TabHost tabHost=(TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabSpec spec1=tabHost.newTabSpec("Daily");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("Daily");

        TabSpec spec2=tabHost.newTabSpec("Agenda");
        spec2.setIndicator("Agenda");
        spec2.setContent(R.id.tab2);

    
       
        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        
        }
   

    
    
}