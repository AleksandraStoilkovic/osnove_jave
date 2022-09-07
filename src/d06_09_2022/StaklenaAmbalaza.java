package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza {

//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//	kaucija za flasu
//	atribut koji kaze da li se za flasu placa kaucija
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu
//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2
//	metoda stampaj stampa sve podatke iz klase staklena flasa.

	protected double kaucija;
	protected boolean isKaucija;
	protected double osnovnaCena;

	public StaklenaAmbalaza(String barkod, String nazivProizvoda, double netoTezina, double brutoTezina, double kaucija,
			boolean isKaucija, double osnovnaCena) {
		super(barkod, nazivProizvoda, netoTezina, brutoTezina);
		this.kaucija = kaucija;
		this.isKaucija = isKaucija;
		this.osnovnaCena = osnovnaCena;
	}

	public StaklenaAmbalaza() {
		super();
	}

	public double getKaucija() {
		return kaucija;
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isKaucija() {
		return isKaucija;
	}

	public void setKaucija(boolean isKaucija) {
		this.isKaucija = isKaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaProizvoda() {
		return isKaucija ? this.osnovnaCena * 1.2 + this.kaucija : this.osnovnaCena * 1.2;
	}

	@Override
	public void stampaj() {
		System.out.println("Kaucija se placa: " + this.isKaucija + ", i ona iznosi " + this.kaucija);
		System.out.println("Cena proizvoda je " + this.cenaProizvoda());

	}
}
