package com.example.aplikasibdm;

public class Soal {
	private String[] soal;
	private String[] jawaban;
	private String[] pilihanA;
	private String[] pilihanB;
	private String[] pilihanC;
	private String[] pilihanD;
	
	public Soal() {
		this.soal = null;
		this.jawaban = null;
		this.pilihanA= null;
		this.pilihanB=null;
		this.pilihanC=null;
		this.pilihanD=null;
	}
	
	
	public String[] getPilihanA() {
		return pilihanA;
	}
	public void setPilihanA(String[] pilihanA) {
		this.pilihanA = pilihanA;
	}
	public String[] getPilihanB() {
		return pilihanB;
	}
	public void setPilihanB(String[] pilihanB) {
		this.pilihanB = pilihanB;
	}
	public String[] getPilihanC() {
		return pilihanC;
	}
	public void setPilihanC(String[] pilihanC) {
		this.pilihanC = pilihanC;
	}
	public String[] getPilihanD() {
		return pilihanD;
	}
	public void setPilihanD(String[] pilihanD) {
		this.pilihanD = pilihanD;
	}

	public String[] getSoal() {
		return soal;
	}
	public void setSoal(String[] soal) {
		this.soal = soal;
	}
	public String[] getJawaban() {
		return jawaban;
	}
	public void setJawaban(String[] jawaban) {
		this.jawaban = jawaban;
	}

	
	
}
