package d23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu ZeleniKarton koja ima:
//			ime i prezime studenta 
//			broj indeksa 
//			naziv predmeta
//			ime i prezime profesora
//			ocenu - od 5 do 10
//			gettere i settere
//			konstruktore
//			metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//			metodu stampaj koja stampa podatke u formatu:
//					(naziv predmeta) - (ocena)
//					Student: ime i prezime, broj indeksa
//					Profesor: ime i prezime
//
//				U glavnoj klasi:
//			kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

		ArrayList<ZeleniKarton> zeleniKartoni = new ArrayList<ZeleniKarton>();
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite broj kartona: ");
		int n = s.nextInt();
		s.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite ime i prezime studenta: ");
			String imeIPrezimeStudenta = s.nextLine();
			System.out.print("Unesite broj indeksa: ");
			String brIndeksa = s.nextLine();
			System.out.print("Unesite naziv predmeta: ");
			String nazivPredmeta = s.nextLine();
			System.out.print("Unesite ime i prezime profesora: ");
			String imeIPrezimeProfesora = s.nextLine();
			System.out.print("Unesite ocenu: ");
			int ocena = s.nextInt();
			s.nextLine();
			ZeleniKarton niz = new ZeleniKarton(imeIPrezimeStudenta, brIndeksa, nazivPredmeta, imeIPrezimeProfesora,
					ocena);
			zeleniKartoni.add(niz);
		}
		for (int i = 0; i < n; i++) {
			zeleniKartoni.get(i).print();
		}
		int sumaOcena = 0;
		for (int i = 0; i < n; i++) {
			sumaOcena = sumaOcena + zeleniKartoni.get(i).getOcena();
		}
		double prosecnaOcena = sumaOcena * 1.0 / n;
		System.out.println("Prosecna ocena za sve ispite je: " + prosecnaOcena);
		int sumaOcenaPolozenih = 0;
		for (int i = 0; i < n; i++) {
			if (zeleniKartoni.get(i).isPolozio()) {
				sumaOcenaPolozenih = sumaOcenaPolozenih + zeleniKartoni.get(i).getOcena();
			} else {
				zeleniKartoni.remove(i);
			}
		}
		double prosecnaOcenaPolozenih = sumaOcenaPolozenih * 1.0 / zeleniKartoni.size();
		System.out.println("Prosecna ocena za polozene ispite je: " + prosecnaOcenaPolozenih);

	}

}
