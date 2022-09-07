package d06_09_2022;

public class Alpinista extends Planinar {
//	(20 poena) Kreirati klasu ​Alpinista ​koja nasleđuje klasu Planinar. Klasa sadrži atribut koji pamti koliko poena 
//	je alpinista ostvario (celobrojna vrednost) i poeni se mogu menjati. Alpinista može da savlada sve uspone do 4000
//	metara, placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju 
//	u formatu: 
//	Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni) 
	protected int poeni;

	public Alpinista(int id, String imeIprezime, int poeni) {
		super(id, imeIprezime);
		this.poeni = poeni;
	}

	public int getPoeni() {
		return poeni;
	}

	public void setPoeni(int poeni) {
		this.poeni = poeni;
	}

	@Override
	public void stampaj() {
		System.out.println("Alpinista, id: " + this.id + " ime: " + this.imeIprezime + " Broj poena: " + this.poeni);
	}

	@Override
	public double clanarina() {
		return 1500 - this.poeni * 50;
	}

	@Override
	public boolean uspesanUspon(Planina p) {
		return p.getVisina() < 4000;
	}

}
