package d06_09_2022;

public class Tetrapak extends Ambalaza {

//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//	atribut koji kaze da li se moze reciklirati
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu tako da ispunjava uslova:
//	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//	ako nije u cenu ulazi samo osnovna cena
//	metoda stampaj stampa sve podatke iz klase tetrapak.

	protected boolean reciklaza;
	protected double osnovnaCena;

	public Tetrapak(String barkod, String nazivProizvoda, double netoTezina, double brutoTezina, boolean reciklaza,
			double osnovnaCena) {
		super(barkod, nazivProizvoda, netoTezina, brutoTezina);
		this.reciklaza = reciklaza;
		this.osnovnaCena = osnovnaCena;
	}

	public Tetrapak() {
		super();
	}

	public boolean isReciklaza() {
		return reciklaza;
	}

	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaProizvoda() {
		return this.reciklaza ? this.tezinaPakovanja() * 1.5 + this.osnovnaCena : this.osnovnaCena;
	}

	@Override
	public void stampaj() {
		System.out.println("Reciklaza je moguca: " + this.reciklaza);
		System.out.println(
				"Osnovna cena proizvoda je " + this.osnovnaCena + ", dok je cena proizvoda " + this.cenaProizvoda());

	}
}
