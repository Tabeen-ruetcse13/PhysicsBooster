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
import android.widget.EditText;
import android.widget.Toast;

public class SecondExpReadingActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_second_exp_reading);
		
		final EditText waterDensityEditText;
		final EditText firstEditText1;
		final EditText firstEditText2;
		final EditText secondEditText1;
		final EditText secondEditText2;
		final EditText thirdEditText1;
		final EditText thirdEditText2;
		final Button okButton2;
		
		waterDensityEditText = (EditText) findViewById(R.id.waterDensityEditText);
		firstEditText1 = (EditText) findViewById(R.id.secondExpFirstEditText1);
		firstEditText2 = (EditText) findViewById(R.id.secondExpFirstEditText2);
		secondEditText1 = (EditText) findViewById(R.id.secondExpSecondEditText1);
		secondEditText2 = (EditText) findViewById(R.id.secondExpSecondEditText2); 
		thirdEditText1 = (EditText) findViewById(R.id.secondExpThirdEditText1);
		thirdEditText2 = (EditText) findViewById(R.id.secondExpThirdEditText2);
		okButton2 = (Button) findViewById(R.id.okButton2);
		
		okButton2.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					okButton2.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					okButton2.getBackground().setAlpha(255);

					if (waterDensityEditText.getText().toString().isEmpty()
							||firstEditText1.getText().toString().isEmpty()
							|| firstEditText2.getText().toString().isEmpty()
							|| secondEditText1.getText().toString().isEmpty()
							|| secondEditText2.getText().toString().isEmpty()
							|| thirdEditText1.getText().toString().isEmpty()
							|| thirdEditText2.getText().toString().isEmpty()) {
						Toast.makeText(getBaseContext(), "One or more data fields are empty", Toast.LENGTH_LONG).show();
					} 
					else {
						Double n1 = Double.parseDouble(waterDensityEditText.getText().toString());
						Double n2 = Double.parseDouble(firstEditText1.getText().toString());
						Double n3 = Double.parseDouble(firstEditText2.getText().toString());
						Double n4 = Double.parseDouble(secondEditText1.getText().toString());
						Double n5=Double.parseDouble(secondEditText2.getText().toString());
						Double n6 = Double.parseDouble(thirdEditText1.getText().toString());
						Double n7 = Double.parseDouble(thirdEditText2.getText().toString());
						
						Double volume = (((n2+n4+n6)/3)-(n3+n5+n7)/3)/n1;
						
						Intent intent = new Intent(SecondExpReadingActivity.this, SecondExpResultActivity.class);
						intent.putExtra("ANSWER",String.valueOf(volume) );
						startActivity(intent);
					}
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
		getMenuInflater().inflate(R.menu.activity_second_exp_reading, menu);
		return true;
	}

}
