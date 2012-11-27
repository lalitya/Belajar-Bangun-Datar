package com.example.aplikasibdm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MateriActivity extends Activity{
	TextView judul, deskripsi,sifat,rumus;
	ImageView gambar;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.materi);
		
		judul = (TextView) findViewById(R.id.lblNamaBangun);
		deskripsi= (TextView) findViewById(R.id.lblDeskripsi);
		sifat = (TextView) findViewById(R.id.lblSifat);
		rumus = (TextView) findViewById(R.id.lblrumus);
		gambar = (ImageView) findViewById(R.id.gambarBangun);
		
		PilihanMateriActivity m = new PilihanMateriActivity();
		Bangun persegi = new Bangun();
		persegi.setNama("Persegi");
		persegi.setMateri("Persegi adalah bangun datar dua dimensi yang dibentuk oleh empat buah rusuk  yang sama panjang dan memiliki empat buah sudut yang kesemuanya adalah sudut siku-siku. ");
		String[] sifatPersegi= {
				"1.	Memiliki empat ruas garis AB – DC – AD dan BC ",
				"2.	Keempat ruas garis tersebut sama panjang",
				"3.	Memiliki empat buah sudut sama besar"
		};
		persegi.setCiri(sifatPersegi);
		String[] rumusPersegi={
				"K = s + s + s +s = 4 x s",
				"L =s*s"
		};
		
		String[] keteranganPersegi={
				"s = sisi " ,
				"K = Keliling ",
				"L = luas"	
		};
		
		if(PilihanMateriActivity.idMateri==1){
		
			judul.setText(persegi.getNama());
			deskripsi.setText(persegi.getMateri());
			sifat.setText(persegi.getCiri()[0]);
			
		}else if(PilihanMateriActivity.idMateri==2){
			judul.setText("holalileo");
		}
		

		
	}
	
	public void tampilkanBangun(Bangun bangun){
		
	}

}
