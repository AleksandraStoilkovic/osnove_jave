package d05_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Sektor koja ima:
//			 naziv sektora
//			 platu koja je za taj sektor
//
//			Kreirati abstraktnu klasu Radnik koja ima:
//			 ime i prezime
//			 niz sektora u kojima radi
//			 abstraktnu metodu koja vraca platu radnika
//			 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//			Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//			 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//			Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//			 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//			 suma plata svih sektor / broj sektora * 0.5
//			 override uje metodu za platu, tako da se plata racuna po formuli:
//			(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//			U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati 
//			platu za svakog

		Magacioner ma1 = new Magacioner("Janko Jankovic");
		Menadzer me1 = new Menadzer("Milan Petrovic");
		Sektor s1 = new Sektor("magacin", 40000);
		Sektor s2 = new Sektor("proizvodnja", 40000);
		Sektor s3 = new Sektor("kontrola kvaliteta", 40000);
		Sektor s4 = new Sektor("analiza mera", 40000);
		Sektor s5 = new Sektor("proizvodnja", 40000);
		ma1.zaposliUSektor(s1);
		ma1.zaposliUSektor(s2);
		me1.zaposliUSektor(s3);
		me1.zaposliUSektor(s4);
		me1.zaposliUSektor(s5);
		System.out.println("Plata magacionera " + ma1.imeIPrezime + " iznosi " + ma1.plata() + " din.");
		System.out.println("Plata menadzera " + me1.imeIPrezime + " iznosi " + me1.plata() + " din.");
	}

}
