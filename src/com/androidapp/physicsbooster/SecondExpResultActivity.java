package com.androidapp.physicsbooster;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class SecondExpResultActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_second_exp_result);
		
		String ans = getIntent().getStringExtra("ANSWER");
		TextView resultTextView2;
		
		resultTextView2 = (TextView) findViewById(R.id.resultTextView2);
		
		resultTextView2.setText(Html.fromHtml("The volume of the solid cylinder:\n" + ans + "cm"+"<sup>3</sup>"));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second_exp_result, menu);
		return true;
	}

}
