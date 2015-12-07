package com.androidapp.physicsbooster;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class StartActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_start);
		
		final Button firstExpButton;
		final Button secondExpButton;
		final Button thirdExpButton;
		final Button fourthExpButton;
		
		firstExpButton = (Button) findViewById(R.id.firstExpButton);
		secondExpButton = (Button) findViewById(R.id.secondExpButton);
		thirdExpButton = (Button) findViewById(R.id.thirdExpButton);
		fourthExpButton = (Button) findViewById(R.id.fourthExpButton);
		
		firstExpButton.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					firstExpButton.getBackground().setAlpha(100);
					break;
					
				case MotionEvent.ACTION_UP:
					firstExpButton.getBackground().setAlpha(255);
					Intent intent = new Intent(StartActivity.this,FirstExpStartActivity.class);
					startActivity(intent);
					break;
				default:
					break;
				}				
				
				return false;
			}
		});
		
		secondExpButton.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					secondExpButton.getBackground().setAlpha(100);
					break;
				case MotionEvent.ACTION_UP:
					secondExpButton.getBackground().setAlpha(255);
					Intent intent = new Intent(StartActivity.this,SecondExpStartActivity.class);
					startActivity(intent);
					break;
				default:
					break;
				}
				
				return false;
			}
			
		});
		
		thirdExpButton.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					thirdExpButton.getBackground().setAlpha(100);
					break;
				case MotionEvent.ACTION_UP:
					thirdExpButton.getBackground().setAlpha(255);
					Intent intent = new Intent(StartActivity.this,ThirdExpStartActivity.class);
					startActivity(intent);
					break;
				default:
					break;
				}
				
				return false;
			}
			
		});
		
		fourthExpButton.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					fourthExpButton.getBackground().setAlpha(100);
					break;
				case MotionEvent.ACTION_UP:
					fourthExpButton.getBackground().setAlpha(255);
					Intent intent = new Intent(StartActivity.this,FourthExpStartActivity.class);
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
		getMenuInflater().inflate(R.menu.activity_start, menu);
		return true;
	}

}
