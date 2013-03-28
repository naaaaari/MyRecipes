package com.nrt.myrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sub extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);
        
        Button btn = (Button)findViewById(R.id.button02_id);
        btn.setOnClickListener(new View.OnClickListener() {
        	@Override
        	public void onClick(View v) {
			// TODO Auto-generated method stub
			finish();
        	}
        });
    }
}