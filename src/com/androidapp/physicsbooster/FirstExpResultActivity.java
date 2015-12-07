package com.androidapp.physicsbooster;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class FirstExpResultActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_first_exp_result);
		
		String ans = getIntent().getStringExtra("ANSWER");
		TextView resultTextView1;
		
		resultTextView1 = (TextView) findViewById(R.id.resultTextView1);
		
		resultTextView1.setText("The velocity of sound is\n" + ans + "m/s");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_first_exp_result, menu);
		return true;
	}

}
