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

public class FirstExpStartActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_first_exp_start);
		
		final Button startButton1;
		final Button helpButton1;
		
		startButton1 = (Button) findViewById(R.id.startButton1);
		helpButton1 = (Button) findViewById(R.id.helpButton1);
		
		startButton1.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {

				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					startButton1.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					startButton1.getBackground().setAlpha(255);
					Intent intent = new Intent(FirstExpStartActivity.this, FirstReadingActivity.class);
					startActivity(intent);
					break;
				default:
					break;
				}

				return false;
			}
		});

		helpButton1.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {

				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					helpButton1.getBackground().setAlpha(100);
					break;
				case MotionEvent.ACTION_UP:
					helpButton1.getBackground().setAlpha(255);
					Intent intent = new Intent(FirstExpStartActivity.this, FirstHelpActivity.class);
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
		getMenuInflater().inflate(R.menu.activity_first_exp_start, menu);
		return true;
	}

}
