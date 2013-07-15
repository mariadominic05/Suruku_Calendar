package com.example.suruku_calendar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Context;

public class MainActivity4 extends Activity {

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simport);
        
        addListenerOnButton();
    }
    public void addListenerOnButton() {
   	 
		final Context context = this;
 
		Button button1=(Button) findViewById(R.id.button1);
 
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				 Intent intent = new Intent(MainActivity4.this,MainActivity5.class);
	                MainActivity4.this.startActivity(intent);
				
			}
	
 
		});
 
	}

    
    
}
