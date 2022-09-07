package d06_09_2022;

public class Planina {
//	(10 poena) Kreirati klasu ​Planina ​koja od privatnih atributa ima: 
//	ime planine 
//	naziv države u kojoj se nalazi 
//	visinu planine. 
//	a od javnih metoda: 
//	default-ni konstruktor i konstuktor koji postavlja sve parametre 
//	gettere i settere za sve atribute 
	private String ime;
	private String drzava;
	private double visina;

	public Planina(String ime, String drzava, double visina) {
		super();
		this.ime = ime;
		this.drzava = drzava;
		this.visina = visina;
	}

	public Planina() {
		super();
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public double getVisina() {
		return visina;
	}

	public void setVisina(double visina) {
		this.visina = visina;
	}

}
