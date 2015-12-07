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

public class SecondExpStartActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_second_exp_start);
		
		final Button startButton2;
		final Button helpButton2;
		
		startButton2 = (Button) findViewById(R.id.startButton2);
		helpButton2 = (Button) findViewById(R.id.helpButton2);
		
		startButton2.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {

				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					startButton2.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					startButton2.getBackground().setAlpha(255);
					Intent intent = new Intent(SecondExpStartActivity.this, SecondExpReadingActivity.class);
					startActivity(intent);
					break;
				default:
					break;
				}

				return false;
			}
		});
		
		helpButton2.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {

				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					helpButton2.getBackground().setAlpha(100);
					break;
				case MotionEvent.ACTION_UP:
					helpButton2.getBackground().setAlpha(255);
					Intent intent = new Intent(SecondExpStartActivity.this, SecondHelpActivity.class);
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
		getMenuInflater().inflate(R.menu.activity_second_exp_start, menu);
		return true;
	}

}
