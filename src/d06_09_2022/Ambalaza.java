package d06_09_2022;

public abstract class Ambalaza {
//	Kreirati abstraktnu klasu Ambalaza koja ima:
//	barkod (primer: 328232-2823)
//	naziv artikla
//	neto tezinu
//	bruto tezinu
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere
//	metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//	abstraktnu metodu koja vraca cenu artikla
//	abstraktnu metodu stampaj
	protected String barkod;
	protected String nazivProizvoda;
	protected double netoTezina;
	protected double brutoTezina;

	public Ambalaza() {
		super();
	}

	public Ambalaza(String barkod, String nazivProizvoda, double netoTezina, double brutoTezina) {
		super();
		this.barkod = barkod;
		this.nazivProizvoda = nazivProizvoda;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}

	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public String getNazivProizvoda() {
		return nazivProizvoda;
	}

	public void setNazivProizvoda(String nazivProizvoda) {
		this.nazivProizvoda = nazivProizvoda;
	}

	public double getNetoTezina() {
		return netoTezina;
	}

	public void setNetoTezina(double netoTezina) {
		this.netoTezina = netoTezina;
	}

	public double getBrutoTezina() {
		return brutoTezina;
	}

	public void setBrutoTezina(double brutoTezina) {
		this.brutoTezina = brutoTezina;
	}

	public double tezinaPakovanja() {
		return this.brutoTezina - this.netoTezina;
	}

	public abstract double cenaProizvoda();

	public abstract void stampaj();
}
