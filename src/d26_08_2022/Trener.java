package d26_08_2022;

public class Trener extends Osoba {
//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//	godine iskustva
//	tip trenera (kondicioni, za igru, pomocni, personalni)
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
	private int godineIskustva;
	private String tip;

	public Trener(String imeIPrezime, String jmbg, int godRodjenja, int godineIskustva, String tip) {
		super(imeIPrezime, jmbg, godRodjenja);
		this.godineIskustva = godineIskustva;
		this.tip = tip;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.godineIskustva + ", " + this.tip);
	}
}