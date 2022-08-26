package d25_08_2022;

import java.util.ArrayList;

public class Listic {
//	Kreirati klasu Listic koja ima: 
//niz kombinacija - maksimalno 7 kombinacija
//metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za proveru. 
//Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji prosledjena kombinacija. 
//Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
//Zaglavlje metode 
//public boolean dobitna(Kombinacija dobitnaKombinacija)
//metodu koja stampa listic u formatu
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23
//
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23
//
//…… i tako za sve kombinacije
	
	private ArrayList<Kombinacija> kombinacije = new ArrayList<Kombinacija>();
	
	public void dodajKombinaciju(Kombinacija k) {
		if(this.kombinacije.size()<=6) {
		this.kombinacije.add(k);
	}
	}
	public boolean daLiJeDobitna(Kombinacija k) {
		for(int i=0; i<this.kombinacije.size(); i++) {
			if(this.kombinacije.get(i).getBrojevi().equals(k.getBrojevi())) {
				return true;
			}
		}
		return false;
	}

	public boolean daLiPostojiIsta(Kombinacija k) {
		for(int i=0; i<this.kombinacije.size(); i++) {
			if(this.kombinacije.get(i).getBrojevi().equals(k.getBrojevi())) {
				return true;
			}
		}
		return false;
	}
	//metodu koja stampa listic u formatu
	//ID: id kombinacije
	//brojevi: 1, 3, 5, 14, 15, 21, 23
	//
	//ID: id kombinacije
	//brojevi: 1, 3, 5, 14, 15, 21, 23
	//
	//…… i tako za sve kombinacije
	public void print() {
		for(int i=0; i<this.kombinacije.size(); i++) {
			this.kombinacije.get(i).print();
			System.out.println();
		}
	}
}
