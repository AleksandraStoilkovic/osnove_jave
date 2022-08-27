package d26_08_2022;

import java.util.ArrayList;

public class Igrac extends Osoba {
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//	broj (broj koji igrac nosi)
//	poziciju koju igra (odbrambeni, napadac, … )
//	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere za broj, kapiten i poziciju
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
	
	private int broj;
	private String pozicija;
	private boolean kapiten;
	private ArrayList<Karton> kartoni = new ArrayList<Karton>();
	public Igrac() {
		super();
	}
	public Igrac(String imeIPrezime, String jmbg, int godRodjenja,int broj, String pozicija, boolean kapiten){
		super(imeIPrezime, jmbg, godRodjenja);
		this.broj = broj;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}
	
	
	public void dodajKarton(Karton karton) {
		this.kartoni.add(karton);
	}
	public int getBroj() {
		return broj;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	public String getPozicija() {
		return pozicija;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	public boolean isKapiten() {
		return kapiten;
	}
	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.print(this.broj + ", " + this.pozicija);
		if(isKapiten()) {
			System.out.print(", ovaj igrac je kapiten.");
		}
		System.out.println();
	}
//	metodu koja vraca broj zutih kartona
//	metodu koja vraca broj crvenih kartona
	public int brojZutih() {
		int brojZutih = 0;
		for(int i=0; i<this.kartoni.size(); i++) {
			if(this.kartoni.get(i).getTip().equals("zuti")) {
				brojZutih++;
			}
		}
		return brojZutih;
	}
	public int brojCrvenih() {
		int brojCrvenih = 0;
		for(int i=0; i<this.kartoni.size(); i++) {
			if(this.kartoni.get(i).getTip().equals("crveni")) {
				brojCrvenih++;
			}
		}
		return brojCrvenih;
	}
}
