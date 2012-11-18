package com.rpl.aplikasibdm;

import com.rpl.aplikasibdm.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class BDM extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bdm);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_bdm, menu);
		return true;
	}

}
