package d06_09_2022;

import java.util.ArrayList;

public class PlaninarskiDom {
//	(25 poena) Kreirati klasu ​PlaninarskiDom​ koja ima privatne atribute: 
//	naziv doma 
//	godinu kada je osnovan. 
//	članove doma koji su planinari (klasa vodi računa o nizu) 
//	Dok od javnih: 
//	default-ni konstuktor i konstuktor koji postavlja sve parametre 
//	gettere i settere koji su potrebni 
//	metodu učlani planinara, koja dodaje planinara u niz 
//	metodu koja ​vraća ​broj planinara koji će se uspešno popeti na planinu (metoda za parametar prima Planinu za koju se
//			proverava informacija) 
//	metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju 
//	metodu koja štampa podatke o domu i o svim članovima doma
//	metodu koja racuna i vraca mesecni prihod od clanarina svih planinara

	private String naziv;
	private int godinaOsnivanja;
	private ArrayList<Planinar> clanovi = new ArrayList<Planinar>();

	public PlaninarskiDom(String naziv, int godinaOsnivanja) {
		super();
		this.naziv = naziv;
		this.godinaOsnivanja = godinaOsnivanja;
	}

	public PlaninarskiDom() {
		super();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}

	public ArrayList<Planinar> getClanovi() {
		return clanovi;
	}

	public void uclaniPlaninara(Planinar p) {
		this.clanovi.add(p);
	}

	public int brojPopetih(Planina p) {
		int uspesno = 0;
		for (int i = 0; i < this.clanovi.size(); i++) {
			if (this.clanovi.get(i).uspesanUspon(p)) {
				uspesno++;
			}
		}
		return uspesno;
	}

	public void izbacitiPlaninara(int id) {
		for (int i = 0; i < this.clanovi.size(); i++) {
			if (id == this.clanovi.get(i).getId()) {
				this.clanovi.remove(i);
			}
		}
	}

	public void stampaj() {
		System.out.println("Planinarski dom " + this.naziv + ", osnovan " + this.godinaOsnivanja + " godine.");
		System.out.println("Clanovi: ");
		for (int i = 0; i < this.clanovi.size(); i++) {
			System.out.print(i+1 +". ");
			this.clanovi.get(i).stampaj();
		}
	}

	public double mesecniPrihod() {
		double suma = 0;
		for (int i = 0; i < this.clanovi.size(); i++) {
			suma += this.clanovi.get(i).clanarina();
		}
		return suma;
	}
}
