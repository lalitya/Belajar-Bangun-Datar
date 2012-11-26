package com.example.aplikasibdm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PilihanMateriActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pilihan_materi);
	}

	public void toPersegi(View v){
		
		
		masukMateri();

	}
	
	public void masukMateri(){
		Intent i = new Intent();
		 i.setClass(this, MateriActivity.class);
         startActivity(i);
	}
}
