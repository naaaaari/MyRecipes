package com.nrt.myrecipes;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Window;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splash);
        
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
        	@Override
        	public void run() {
        		startActivity(new Intent(SplashActivity.this, Main.class));
        		finish();
        	}
        	
        }, 1500);
    }
}
 