package d06_09_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		(10 poena) Kreirati klasu ​Planina ​koja od privatnih atributa ima: 
//			ime planine 
//			naziv države u kojoj se nalazi 
//			visinu planine. 
//			a od javnih metoda: 
//			default-ni konstruktor i konstuktor koji postavlja sve parametre 
//			gettere i settere za sve atribute 
//
//			(15 poena) Kreirati apstraktnu klasu ​Planinar ​koja od zaštićenih atributa ima: 
//			jedinstveni celobrojni identifikacioni broj
//			ime i prezime 
//			Dok od javnih metoda: 
//			konstruktor koji postavlja sve atribute klase. 
//			gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije tj. posle njihovog postavljanja u 
//					konstruktoru)
//			apstraktnu metodu štampaj
//			apstraktnu metodu koja vraca clanarinu planinara
//			apstraktnu metodu uspesanUspon koja ​vraća ​informaciju da li će se planinar upešno popeti na planinu. Metoda
//			kao ulazni parametar prima objekat tipa Planina. 
//			(20 poena) Kreirati klasu ​RekreativniPlaninar​ koja nasleđuje klasu Planinar. Klasa dodatno pamti još neke 
//			informacije koje se ne mogu menjati nakon postavljanja u konstuktoru: 
//			težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg) 
//			naziv okruga odakle je rekreativni planinar. 
//			maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//			da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine 
//			planine, s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara 
//			manje. 
//			rekeativci placaju clanarinu u iznosu od 1000 rsd
//			metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu: 
//			Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug) 
//			(20 poena) Kreirati klasu ​Alpinista ​koja nasleđuje klasu Planinar. Klasa sadrži atribut koji pamti koliko poena 
//			je alpinista ostvario (celobrojna vrednost) i poeni se mogu menjati. Alpinista može da savlada sve uspone do 4000
//			metara, placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju 
//			u formatu: 
//			Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni) 
//
//			(25 poena) Kreirati klasu ​PlaninarskiDom​ koja ima privatne atribute: 
//			naziv doma 
//			godinu kada je osnovan. 
//			članove doma koji su planinari (klasa vodi računa o nizu) 
//			Dok od javnih: 
//			default-ni konstuktor i konstuktor koji postavlja sve parametre 
//			gettere i settere koji su potrebni 
//			metodu učlani planinara, koja dodaje planinara u niz 
//			metodu koja ​vraća ​broj planinara koji će se uspešno popeti na planinu (metoda za parametar prima Planinu za koju se
//					proverava informacija) 
//			metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju 
//			metodu koja štampa podatke o domu i o svim članovima doma
//			metodu koja racuna i vraca mesecni prihod od clanarina svih planinara
//			(10 poena) U glavnom programu kreirati jedan planinarski dom, i u njemu učlaniti nekoliko rekreativnih planinara i 
//			nekoliko alpinista (minimum po 3), i istestirati svaku od metoda. 
//			Napomena​: Za funkcionalnost koju ne znate da uradite, izostavite njenu implementaciju i smatrajte da je ona 
//			implementirana. 

		PlaninarskiDom pd = new PlaninarskiDom("Planinarski Dom Nis", 1987);

		pd.uclaniPlaninara(new RekreativniPlaninar(786, "Aleksandra Stoilkovic", 5, "Jablanicki", 1000));
		pd.uclaniPlaninara(new RekreativniPlaninar(87, "Janko Petrovic", 10, "Macvanski", 2000));
		pd.uclaniPlaninara(new RekreativniPlaninar(35, "Marko Nikolic", 15, "Niski", 2500));
		pd.uclaniPlaninara(new Alpinista(64, "Marija Jovanovic", 5));
		pd.uclaniPlaninara(new Alpinista(145, "Jovan Stankovic", 7));
		pd.uclaniPlaninara(new Alpinista(15, "Jovana Markovic", 2));
		pd.stampaj();
		pd.izbacitiPlaninara(87);
		pd.stampaj();
		System.out.println("Planinarski dom ostvaruje mesecni prihod u iznosu od " + pd.mesecniPrihod() + " dinara.");
		Planina p = new Planina("Sar planina", "Srbija", 2685);
		System.out.print("Broj popetih na planinu: " + p.getIme());
		System.out.println(" iznosi " + pd.brojPopetih(p) + ".");

	}
}
