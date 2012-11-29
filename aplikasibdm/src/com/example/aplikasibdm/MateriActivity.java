package com.example.aplikasibdm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MateriActivity extends Activity{
	static TextView judul=null, deskripsi=null,sifat1=null,sifat2=null,sifat3=null,sifat4=null,sifat5=null,rumusLuas=null, rumusKeliling=null, ket1=null, ket2=null, ket3=null,ket4=null,ket5=null;
	static ImageView gambar=null;
	static Bangun persegi;
	static Bangun persegiPanjang;
	static Bangun segitigaSamaKaki;
	static Bangun segitigaSamaSisi;
	static Bangun segitigaSikusiku;
	static Bangun belahKetupat;
	static Bangun trapesium;
	static Bangun jajarGenjang;
	static Bangun layangLayang;
	static Bangun lingkaran;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.materi);
		
		judul = (TextView) findViewById(R.id.lblNamaBangun);
		gambar = (ImageView) findViewById(R.id.gambarBangun);
		deskripsi= (TextView) findViewById(R.id.lblDeskripsi);
		sifat1 = (TextView) findViewById(R.id.lblSifat);
		sifat2 = (TextView) findViewById(R.id.lblSifat2);
		sifat3 = (TextView) findViewById(R.id.lblSifat3);
		sifat4 = (TextView) findViewById(R.id.lblSifat4);
		sifat5 = (TextView) findViewById(R.id.lblSifat5);
		rumusLuas = (TextView) findViewById(R.id.lblrumusLuas);
		rumusKeliling = (TextView) findViewById(R.id.lblrumusKeliling);
		ket1 = (TextView) findViewById(R.id.lblKet1);
		ket2 = (TextView) findViewById(R.id.lblKet2);
		ket3 = (TextView) findViewById(R.id.lblKet3);
		ket4 = (TextView) findViewById(R.id.lblKet4);
		ket5 = (TextView) findViewById(R.id.lblKet5);
		
		
		
	
		persegi = new Bangun();
		persegiPanjang = new Bangun();
		segitigaSamaKaki = new Bangun();
		segitigaSamaSisi = new Bangun();
		segitigaSikusiku = new Bangun();
		belahKetupat = new Bangun();
		trapesium = new Bangun();
		jajarGenjang = new Bangun();
		layangLayang = new Bangun();
		lingkaran = new Bangun();
		
		if(PilihanMateriActivity.idMateri==1){
		buatPersegi();
		tampilkanBangun(persegi);
			
		}else if(PilihanMateriActivity.idMateri==2){
			buatPersegiPanjang();
			tampilkanBangun(persegiPanjang);
		}else if(PilihanMateriActivity.idMateri==3){
			buatSegitigaSamaKaki();
			tampilkanBangun(segitigaSamaKaki);
		}else if(PilihanMateriActivity.idMateri==4){
			buatSegitigaSamaSisi();
			tampilkanBangun(segitigaSamaSisi);
		}else if(PilihanMateriActivity.idMateri==5){
			buatSegitigaSikusiku();
			tampilkanBangun(segitigaSikusiku);
		}else if(PilihanMateriActivity.idMateri==6){
			buatBelahKetupat();
			tampilkanBangun(belahKetupat);
		}else if(PilihanMateriActivity.idMateri==7){
			buatTrapesium();
			tampilkanBangun(trapesium);
		}else if(PilihanMateriActivity.idMateri==8){
			buatJajarGenjang();
			tampilkanBangun(jajarGenjang);
		}else if(PilihanMateriActivity.idMateri==9){
			buatLayangLayang();
			tampilkanBangun(layangLayang);
		}else if(PilihanMateriActivity.idMateri==10){
			buatLingkaran();
			tampilkanBangun(lingkaran);
		}
		
	}
	


	public static void tampilkanBangun(Bangun bangun){
		judul.setText(bangun.getNama());
		gambar.setImageResource(bangun.getGambar());
		deskripsi.setText(bangun.getMateri());
		sifat1.setText(bangun.getCiri()[0]);
		sifat2.setText(bangun.getCiri()[1]);
		sifat3.setText(bangun.getCiri()[2]);
		sifat4.setText(bangun.getCiri()[3]);
		sifat5.setText(bangun.getCiri()[4]);
		rumusKeliling.setText(bangun.getRumus()[0]);
		rumusLuas.setText(bangun.getRumus()[1]);
		ket1.setText(bangun.getKeterangan()[0]);
		ket2.setText(bangun.getKeterangan()[1]);
		ket3.setText(bangun.getKeterangan()[2]);
		ket4.setText(bangun.getKeterangan()[3]);
		ket5.setText(bangun.getKeterangan()[4]);
	}
	
	public static void buatPersegi(){
		persegi.setNama("Persegi");
		persegi.setGambar(R.drawable.persegi);
		persegi.setMateri("Persegi adalah bangun datar dua dimensi yang dibentuk oleh empat buah rusuk  yang sama panjang dan memiliki empat buah sudut yang kesemuanya adalah sudut siku-siku. ");
		String[] sifatPersegi= {
				"1.	Memiliki empat ruas garis AB – DC – AD dan BC ",
				"2.	Keempat ruas garis tersebut sama panjang",
				"3.	Memiliki empat buah sudut sama besar",
				"",
				""
		};
		persegi.setCiri(sifatPersegi);
		String[] rumusPersegi={
				"K = s + s + s +s = 4 x s",
				"L =s*s"
		};
		persegi.setRumus(rumusPersegi);
		String[] keteranganPersegi={
				"s = sisi " ,
				"K = Keliling ",
				"L = luas",
				"",
				""
		};
		persegi.setKeterangan(keteranganPersegi);
		
	}
	
	public static void buatPersegiPanjang(){
		persegiPanjang.setNama("Persegi Panjang");
		persegiPanjang.setGambar(R.drawable.persegi_panjang);
		persegiPanjang.setMateri("Bangun datar dua dimensi yang dibentuk oleh dua pasang rusuk yang masing-masing sama panjang dan sejajar dengan pasangannya, dan memiliki empat buah sudut yang kesemuanya adalah sudut siku-siku.");
		String[] sifatPersegi= {
				"1.	Memiliki empat ruas garis AB – DC – AD dan BC",
				"2.	Dua garis yang berhadapan sama panjang",
				"3.	Memiliki dua macam ukuran panjang dan lebar",
				"4.	Memiliki empat buah sudut sama besar",
				""
		};
		persegiPanjang.setCiri(sifatPersegi);
		String[] rumusPersegiPanjang={
				"K = p + l +p + l = 2(p + l)",
				"L = p * l"
		};
		persegiPanjang.setRumus(rumusPersegiPanjang);
		String[] keteranganPersegiPanjang={
				"p = Panjang " ,
				"l = Lebar",
				"K = Keliling ",
				"L = Luas",
				""
		};
		persegiPanjang.setKeterangan(keteranganPersegiPanjang);
		
	}
	public static void buatSegitigaSamaKaki(){
		segitigaSamaKaki.setNama("Segitiga Sama Kaki");
		segitigaSamaKaki.setGambar(R.drawable.segitiga_sama_kaki);
		segitigaSamaKaki.setMateri("Segitiga sama kaki adalah bangun datar yang terdiri dari tiga garis yang dua diantaranya memiliki panjang yang sama (disebut sebagai kaki segitiga)");
		String[] sifatPersegi= {
				"1.	Memiliki tiga ruas garis AB – BC dan CA",
				"2.	Dua ruas garis kaki sama panjang , AC dan BC",
				"3.	Memiliki dua macam ukuran alas dan tinggi",
				"4.	Memiliki 3 buah sudut lancip",
				""
		};
		segitigaSamaKaki.setCiri(sifatPersegi);
		String[] rumusPersegiPanjang={
				"K = a + b + c",
				"L =1/2 (a * t)"
		};
		segitigaSamaKaki.setRumus(rumusPersegiPanjang);
		String[] keteranganPersegiPanjang={
				"a = Alas " ,
				"t = Tinggi",
				"K = Keliling ",
				"L = Luas",
				""
		};
		segitigaSamaKaki.setKeterangan(keteranganPersegiPanjang);
		
	}

	public static void buatSegitigaSamaSisi(){
		segitigaSamaSisi.setNama("Segitiga Sama Sisi");
		segitigaSamaSisi.setGambar(R.drawable.segitiga_sama_sisi);
		segitigaSamaSisi.setMateri("Segitiga sama sisi adalah bangun datar yang terdiri dari tiga garis yang semua garis ukurannya sama panjang");
		String[] sifatPersegi= {
				"1.	Memiliki tiga ruas garis AB – BC dan CA",
				"2.	Ketiga (semua) ruas garis sama panjang",
				"3.	Memiliki dua macam ukuran alas dan tinggi",
				"4.	Memiliki 3 buah sudut sama besar",
				""
		};
		segitigaSamaSisi.setCiri(sifatPersegi);
		String[] rumusPersegiPanjang={
				"K = a + b + c",
				"L =1/2 (a * t)"
		};
		segitigaSamaSisi.setRumus(rumusPersegiPanjang);
		String[] keteranganPersegiPanjang={
				"a = Alas " ,
				"t = Tinggi",
				"K = Keliling ",
				"L = Luas",
				""
		};
		segitigaSamaSisi.setKeterangan(keteranganPersegiPanjang);
	}
	
	public static void buatSegitigaSikusiku(){
		segitigaSikusiku.setNama("Segitiga Siku-siku");
		segitigaSikusiku.setGambar(R.drawable.segitiga_siku_siku);
		segitigaSikusiku.setMateri("Segitiga sikusiku adalah bangun datar yang terdiri dari tiga garis yang salah satu sudutnya membentuk sudut 90 derajat");
		String[] sifatPersegi= {
				"1.	Memiliki tiga ruas garis AB – BC dan CA",
				"2.	Memiliki garis tegak lurus pada alas (tinggi)",
				"3.	Memiliki dua macam ukuran alas dan tinggi",
				"4.	Memiliki 2 buah sudut lancip",
				"5.	Memiliki satubuah sudut siku-siku"
		};
		segitigaSikusiku.setCiri(sifatPersegi);
		String[] rumusPersegiPanjang={
				"K = a + b + c",
				"L =1/2 (a * t)"
		};
		segitigaSikusiku.setRumus(rumusPersegiPanjang);
		String[] keteranganPersegiPanjang={
				"a = Alas " ,
				"t = Tinggi",
				"K = Keliling ",
				"L = Luas",
				""
		};
		segitigaSikusiku.setKeterangan(keteranganPersegiPanjang);
	}
	
	public static void buatBelahKetupat(){
		belahKetupat.setNama("Belah Ketupat");
		belahKetupat.setGambar(R.drawable.belah_ketupat);
		belahKetupat.setMateri("Belah Ketupat adalah bangun datar dua dimensi yang dibentuk oleh empat buah rusuk yang sama panjang, dan memiliki dua pasang sudut bukan siku-siku yang masing-masing sama besar dengan sudut di hadapannya");
		String[] sifatPersegi= {
				"1.	Memiliki empat ruas garis AB – BC – CD dan DA",
				"2.	Dua ruas garis yang berhadapan sama panjang",
				"3.	Memiliki dua macam ukuran diagonal, yaitu diagonal 1 dan 2",
				"4.	Memiliki 2 buah sudut lancip",
				"5.	Memiliki 2 buah sudut tumpul"
		};
		belahKetupat.setCiri(sifatPersegi);
		String[] rumusPersegiPanjang={
				"K = 4 * s",
				"L =1/2 * D1 * D2"
		};
		belahKetupat.setRumus(rumusPersegiPanjang);
		String[] keteranganPersegiPanjang={
				"D1 = Diagonal 1 " ,
				"D2 = Diagonal 2 ",
				"K = Keliling ",
				"L = Luas",
				""
		};
		belahKetupat.setKeterangan(keteranganPersegiPanjang);
	}
	
	public static void buatTrapesium(){
		trapesium.setNama("Trapesium");
		trapesium.setGambar(R.drawable.trapesium);
		trapesium.setMateri("Trapesium adalah bangun datar dua dimensi yang dibentuk oleh empat buah rusuk yang dua diantaranya saling sejajar namun tidak sama panjang.");
		String[] sifatPersegi= {
				"1.	Memiliki empat ruas garis AB – BC – CD dan DA",
				"2.	Garis tinggi adalah garis yang tegak lurus dengan alas.",
				"3.	Memiliki dua macam ukuran alas dan tinggi",
				"4.	Memiliki 2 buah sudut lancip",
				"5.	Memiliki 2 buah sudut tumpul"
		};
		trapesium.setCiri(sifatPersegi);
		String[] rumusPersegiPanjang={
				"K = AB + BC + CD + DA",
				"L = a * t "
		};
		trapesium.setRumus(rumusPersegiPanjang);
		String[] keteranganPersegiPanjang={
				"a = alas " ,
				"t = tinggi",
				"K = Keliling ",
				"L = Luas",
				""
		};
		trapesium.setKeterangan(keteranganPersegiPanjang);
	}
	
	public static void buatJajarGenjang(){
		jajarGenjang.setNama("Jajar Genjang");
		jajarGenjang.setGambar(R.drawable.jajar_genjang);
		jajarGenjang.setMateri("Jajar Genjang adalah bangun datar dua dimensi yang dibentuk oleh dua pasang rusuk yang masing-masing sama panjang dan sejajar dengan pasangannya, dan memiliki dua pasang sudut bukan siku-siku yang masing-masing sama besar dengan sudut di hadapannya.");
		String[] sifatPersegi= {
				"1.	Memiliki empat ruas garis AB – BC – CD dan DA",
				"2.	Dua ruas garis yang berhadapan sama panjang",
				"3.	Memiliki dua macam ukuran alas dan tinggi",
				"4.	Memiliki 2 buah sudut lancip",
				"5.	Memiliki 2 buah sudut tumpul"
		};
		jajarGenjang.setCiri(sifatPersegi);
		String[] rumusPersegiPanjang={
				"K = 2*ALAS + 2 * SISI MIRING",
				"L = a * t "
		};
		jajarGenjang.setRumus(rumusPersegiPanjang);
		String[] keteranganPersegiPanjang={
				"a = alas " ,
				"t = tinggi",
				"K = Keliling ",
				"L = Luas",
				""
		};
		jajarGenjang.setKeterangan(keteranganPersegiPanjang);
	}
	
	public static void buatLayangLayang(){
		layangLayang.setNama("Layang-layang");
		layangLayang.setGambar(R.drawable.layang_layang);
		layangLayang.setMateri("Layang-layang adalah bangun datar dua dimensi yang dibentuk oleh dua pasang rusuk yang masing-masing pasangannya sama panjang dan saling membentuk sudut.");
		String[] sifatPersegi= {
				"1.	Memiliki empat ruas garis AB – BC – CD dan DA",
				"2.	Garis tinggi adalah garis yang tegak lurus dengan alas.",
				"3.	Memiliki dua macam ukuran alas dan tinggi",
				"4.	Memiliki 2 buah sudut lancip",
				"5.	Memiliki 2 buah sudut tumpul"
		};
		layangLayang.setCiri(sifatPersegi);
		String[] rumusPersegiPanjang={
				"K = AB + BC + CD + DA",
				"L = a * t "
		};
		layangLayang.setRumus(rumusPersegiPanjang);
		String[] keteranganPersegiPanjang={
				"a = alas " ,
				"t = tinggi",
				"K = Keliling ",
				"L = Luas",
				""
		};
		layangLayang.setKeterangan(keteranganPersegiPanjang);
	}
	
	public static void buatLingkaran(){
		lingkaran.setNama("Lingkaran");
		lingkaran.setGambar(R.drawable.lingkaran);
		lingkaran.setMateri("lingkaran adalah himpunan semua titik pada bidang dalam jarak tertentu, yang disebut jari-jari, dari suatu titik tertentu, yang disebut pusat");
		String[] sifatPersegi= {
				"1.	Memiliki jari-jari",
				"2.	Satu sisi yang melingkar dengan jarak yang sama ke titik pusat",
				"",
				"",
				""
		};
		lingkaran.setCiri(sifatPersegi);
		String[] rumusPersegiPanjang={
				"K = 2 * phi *r",
				"L = phi * r * r"
		};
		lingkaran.setRumus(rumusPersegiPanjang);
		String[] keteranganPersegiPanjang={
				"phi = 3,14 " ,
				"r = Jari-jari",
				"K = Keliling ",
				"L = Luas",
				""
		};
		
		lingkaran.setKeterangan(keteranganPersegiPanjang);
	}
	
}
