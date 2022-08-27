package d26_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Osoba koja ima:
//			ime i prezime
//			jmbg
//			godinu rodjenja
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere 
//			metodu stampaj koja stampa u formatu:
//			(ime i prezime), (jmbg), (godina rodjenja)
//
//			Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//			broj (broj koji igrac nosi)
//			poziciju koju igra (odbrambeni, napadac, … )
//			kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere za broj, kapiten i poziciju
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//			Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//			godine iskustva
//			tip trenera (kondicioni, za igru, pomocni, personalni)
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//			U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//
//
//			(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i 
//			trenere. Podatke za igrace i trenere unosi korisnik sa tastature.
		Igrac i1 = new Igrac("Nikola Nikolic", "456446465454", 1990, 5, "odbrambeni", false);
		Igrac i2= new Igrac("Radoje Radmilovic", "86764566556", 1992, 14, "napadac", true);
		Trener t1= new Trener("Marko Markovic", "787454687866", 1980, 7, "personalni");
		Trener t2= new Trener("Dragan Jovanovic", "8985658598463", 1974, 15, "kondicioni");
		
		i1.print();
		i2.print();
		t1.print();
		t2.print();
		ArrayList<Igrac> igraci = new ArrayList<Igrac>();
		ArrayList<Trener> treneri = new ArrayList<Trener>();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite N za igrace: ");
		int n = s.nextInt();
		s.nextLine();
		for(int i=0; i<n; i++) {
			System.out.print("Unesite ime igraca: ");
			String imeIPrezime = s.nextLine();
			System.out.print("Unesite jmbg igraca: ");
			String jmbg = s.nextLine();
			System.out.print("Unesite godinu rodjenja igraca: ");
			int godRodjenja = s.nextInt();
			System.out.print("Unesite broj pozicije: ");
			int broj = s.nextInt();
			s.nextLine();
			System.out.println("Unesite poziciju koju igra: ");
			String pozicija = s.nextLine();
			System.out.println("Unesite da li je igrac kapiten(true/false): ");
			boolean kapiten = s.nextBoolean();
			s.nextLine();
			
			Igrac igrac = new Igrac(imeIPrezime, jmbg, godRodjenja, broj, pozicija, kapiten);
			igraci.add(igrac);
		}
		System.out.println("Unesite N za trenere: ");
		n = s.nextInt();
		s.nextLine();
		for(int i=0; i<n; i++) {
			System.out.print("Unesite ime trenera: ");
			String imeIPrezime = s.nextLine();
			System.out.print("Unesite jmbg trenera: ");
			String jmbg = s.nextLine();
			System.out.print("Unesite godinu rodjenja trenera: ");
			int godRodjenja = s.nextInt();
			System.out.println("Unesite godine iskustva: ");
			int godineIskustva= s.nextInt();
			s.nextLine();
			System.out.println("Unesite tip trenera: ");
			String tip = s.nextLine();
			
			Trener trener = new Trener(imeIPrezime, jmbg, godRodjenja, godineIskustva, tip);
			treneri.add(trener);
	}
		for(int i = 0; i<igraci.size(); i++) {
			igraci.get(i).print();
		}
		for(int i = 0; i<treneri.size(); i++) {
			treneri.get(i).print();
		}
}
}