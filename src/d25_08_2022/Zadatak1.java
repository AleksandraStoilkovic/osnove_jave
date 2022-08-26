package d25_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Student koja ima
//		broj indeksa
//		ime i prezime
//		tip studija (osnovne, master, doktorske)
//		niz ispita
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za indeks, ime i prezime, tip studija
//		getter za niz predmeta
//		metodu dodaj ispit u niz ispita
//		metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//		metodu stampaj koja stampa u formatu:
//		(broj indeksa) - (ime i prezime) - (tip studija)
//		Predmeti:
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		Prosecna ocena: (prosecna ocena)
	//
	//
//		Napisati klasu Ispit koja ima
//		naziv predmeta
//		ocenu (u rasponu od 5 do 10)
//		Ime i prezime profesora koji predaje predmet
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za sve atribute
//		metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//		metodu koja stampa ispit u formatu:
//		(naziv predmeta) - (profesor) - (ocena)
		
		Student s = new Student("1254", "Nikola Nikolic", "osnovne");
		Ispit prvi = new Ispit("matematika 1", 5, "Pavle Pavlovic");
		Ispit drugi = new Ispit("matematika 2", 7, "Dragan Radojcic");
		Ispit treci = new Ispit("matematika 1", 8, "Pavle Pavlovic");
		Ispit cetvrti = new Ispit("matematika 3", 9, "Rada Momcilovic");
		
		s.dodajIspit(prvi);
		s.dodajIspit(drugi);
		s.dodajIspit(treci);
		s.dodajIspit(cetvrti);
		
		s.print();
	}

}
