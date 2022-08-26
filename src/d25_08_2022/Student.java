package d25_08_2022;

import java.util.ArrayList;

public class Student {
//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)
//
//
//	Napisati klasu Ispit koja ima
//	naziv predmeta
//	ocenu (u rasponu od 5 do 10)
//	Ime i prezime profesora koji predaje predmet
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za sve atribute
//	metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//	metodu koja stampa ispit u formatu:
//	(naziv predmeta) - (profesor) - (ocena)
	
	private String brojIndeksa;
	private String imeIPrezime;
	private String tipStudija;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
	public Student(String brojIndeksa, String imeIPrezime, String tipStudija) {
		this.brojIndeksa = brojIndeksa;
		this.imeIPrezime = imeIPrezime;
		this.tipStudija = tipStudija;
	}
	
	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public String getTipStudija() {
		return tipStudija;
	}
	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}
	
	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
		}

	public double prosek() {
		int suma = 0;
		int brojac = 0;;
		for(int i = 0; i<this.ispiti.size();i++) {
		if(this.ispiti.get(i).isPolozio()) {
			suma = suma + this.ispiti.get(i).getOcena();
			brojac++;
		}
	}
		return suma/brojac;
	}
	public void print() {
		System.out.println(this.getBrojIndeksa() + " - " + this.getImeIPrezime() + " - " + this.getTipStudija());
		for(int i = 0; i<this.ispiti.size();i++) {
			this.ispiti.get(i).print();
		}
		System.out.println("Prosecna ocena: " + this.prosek());
	}
}

