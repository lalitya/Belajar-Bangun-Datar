package com.example.aplikasibdm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PilihanMateriActivity extends Activity{
	public  static int idMateri=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pilihan_materi);
	}

	public void toPersegi(View v){
		PilihanMateriActivity.idMateri = 1 ;
		masukMateri();

	}
	public void toPersegiPanjang(View v){
		
		PilihanMateriActivity.idMateri = 2 ;
		masukMateri();
	}
	
	public void toSegitigaSamaKaki(View v){
		PilihanMateriActivity.idMateri = 3 ;
		masukMateri();
	}
	
	public void toSegitigaSamaSisi(View v){
		PilihanMateriActivity.idMateri = 4 ;
		masukMateri();
	}
	
	public void toSegitigaSikusiku(View v){
		PilihanMateriActivity.idMateri = 5 ;
		masukMateri();
	}
	
	public void toBelahKetupat(View v){
		PilihanMateriActivity.idMateri = 6 ;
		masukMateri();
	}
	
	public void toTrapesium(View v){
		PilihanMateriActivity.idMateri = 7 ;
		masukMateri();
	}
	
	public void toJajarGenjang(View v){
		PilihanMateriActivity.idMateri = 8 ;
		masukMateri();
	}
	
	public void toLayanglayang(View v){
		PilihanMateriActivity.idMateri = 9 ;
		masukMateri();
	}	
	
	public void toLingkaran(View v){
		PilihanMateriActivity.idMateri = 10 ;
		masukMateri();
	}
	
	
	
	public void masukMateri(){
		
		Intent i = new Intent();
		 i.setClass(this, MateriActivity.class);
         startActivity(i);
	}
}
