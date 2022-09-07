package d06_09_2022;

public abstract class Planinar {
//	(15 poena) Kreirati apstraktnu klasu ​Planinar ​koja od zaštićenih atributa ima: 
//	jedinstveni celobrojni identifikacioni broj
//	ime i prezime 
//	Dok od javnih metoda: 
//	konstruktor koji postavlja sve atribute klase. 
//	gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije tj. posle njihovog postavljanja u 
//			konstruktoru)
//	apstraktnu metodu štampaj
//	apstraktnu metodu koja vraca clanarinu planinara
//	apstraktnu metodu uspesanUspon koja ​vraća ​informaciju da li će se planinar upešno popeti na planinu. Metoda
//	kao ulazni parametar prima objekat tipa Planina. 
	protected int id;
	protected String imeIprezime;

	public Planinar(int id, String imeIprezime) {
		super();
		this.id = id;
		this.imeIprezime = imeIprezime;
	}

	public int getId() {
		return id;
	}

	public String getImeIprezime() {
		return imeIprezime;
	}

	public abstract void stampaj();

	public abstract double clanarina();

	public abstract boolean uspesanUspon(Planina p);
}
