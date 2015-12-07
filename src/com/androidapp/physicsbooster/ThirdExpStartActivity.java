package com.androidapp.physicsbooster;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class ThirdExpStartActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_third_exp_start);
		
		final Button startButton3;
		final Button helpButton3;
		
		startButton3 = (Button) findViewById(R.id.startButton3);
		helpButton3 = (Button) findViewById(R.id.helpButton3);
		
		startButton3.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {

				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					startButton3.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					startButton3.getBackground().setAlpha(255);
					Intent intent = new Intent(ThirdExpStartActivity.this, ThirdExpReadingActivity.class);
					startActivity(intent);
					break;
				default:
					break;
				}

				return false;
			}
		});
		
		helpButton3.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {

				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					helpButton3.getBackground().setAlpha(100);
					break;
				case MotionEvent.ACTION_UP:
					helpButton3.getBackground().setAlpha(255);
					Intent intent = new Intent(ThirdExpStartActivity.this, ThirdHelpActivity.class);
					startActivity(intent);
					break;
				default:
					break;
				}

				return false;
			}

		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_third_exp_start, menu);
		return true;
	}

}
