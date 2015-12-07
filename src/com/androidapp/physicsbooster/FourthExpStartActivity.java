package com.androidapp.physicsbooster;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class FourthExpStartActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth_exp_start);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_fourth_exp_start, menu);
		return true;
	}

}
