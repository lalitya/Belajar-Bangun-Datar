package com.example.aplikasibdm;

public class Bangun {
	private String nama;
	private int gambar;
	private String materi;
	private String[] ciri;
	private String[] rumus;
	private String[] keterangan;
	
	public Bangun() {
		super();
	}
	private Soal soal;
	
	public Bangun(String nama, int gambar, String materi, String[] ciri,
			String[] rumus) {
		super();
		this.nama = nama;
		this.gambar = gambar;
		this.materi = materi;
		this.ciri = ciri;
		this.rumus = rumus;
	}
	
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getGambar() {
		return gambar;
	}
	public void setGambar(int gambar) {
		this.gambar = gambar;
	}
	public String getMateri() {
		return materi;
	}
	public void setMateri(String materi) {
		this.materi = materi;
	}
	public String[] getCiri() {
		return ciri;
	}
	public void setCiri(String[] ciri) {
		this.ciri = ciri;
	}
	public String[] getRumus(){
		return rumus;
	}
	public void setRumus(String[] rumus) {
		this.rumus = rumus;
	}
	public Soal getSoal() {
		return soal;
	}
	public void setSoal(Soal soal) {
		this.soal = soal;
	}

	public String[] getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String[] keterangan) {
		this.keterangan = keterangan;
	}
	
	
}
