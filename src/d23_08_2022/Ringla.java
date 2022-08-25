package d23_08_2022;

public class Ringla {
//	Kreirati klasu Ringla koja ima:
//	tip ringle (obicna ili ekspres)
//	jacinu 
//	za obicnu ringu jacina je u opsegu od 0 do 3
//	za ekspres ringlu jacina je u opsegu od 0 do 12
//	jacinu grejaca u kW (npr: 0.8, 1, 1.5, …)
//	konstruktor sa parametrima, postavljaju ce tip ringle i jacina grejaca (jacina atribut je po defaultu 0)
//	getter za jacinu
//	setteri ne postoje!!
//	privatnu metodu koja vraca maksimalan broj pojacavanja
//	za obicnu je 3, za ekspres je 12
//	metodu pojacaj ringlu - metoda povecava jacinu za 1 (pazite na opseg)
//	metodu iskljuci ringlu - metoda postavlja jacinu na 0
//	metodu koja vraca informaciju da li je ringla ukljucena ili iskljucena
//	metodu koja vraca potrosnju elektricne energije prema formuli 
//	100 / maksimalan broj pojacavanja * jacina * jacina grejaca * vremenski period koliko vec ringla radi 
//	metoda prima broj sati kao parametar tj. vremenski period koliko ringla vec radi
//	metodu koja stampa podatke u formatu:
//		Ringla je ukljucena ili iskljucena (iskoristite metodu koja vraca tu informaciju da biste odstampali poruku)
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW

	private String tip;
	private int jacinaRingle;
	private double jacinaGrejaca;

	public Ringla(String tip, double jacinaGrejaca) {
		this.tip = tip;
		this.jacinaRingle = 0;
		this.jacinaGrejaca = jacinaGrejaca;
	}

	public int getJacinaRingle() {
		return jacinaRingle;
	}

	private int maksimalnoJacinaRingle() {
		if (tip.equals("obicna")) {
			return 3;
		} else if (tip.equals("ekspres")) {
			return 12;
		}
		return 0;
	}

	public void pojacajRinglu() {
		if (this.jacinaRingle < this.maksimalnoJacinaRingle() && this.tip.equals("obicna") ) {
			this.jacinaRingle = this.jacinaRingle++;
		} else if (this.jacinaRingle < this.maksimalnoJacinaRingle() && tip.equals("ekspres")) {
			this.jacinaRingle = this.jacinaRingle++;
		}
	}

	public void iskljuciRinglu() {
		this.jacinaRingle = 0;
	}

	public boolean isUkljucena() {
		if (this.jacinaRingle == 0) {
			return true;
		}
		return false;
	}

	public double potrosnja(double vreme) {
		return 100 / this.maksimalnoJacinaRingle() * this.jacinaRingle * this.jacinaGrejaca * vreme;
	}

	public void print() {
		if (this.isUkljucena()) {
			System.out.println("Ringla je ukljucena.");
		} else {
			System.out.println("Ringla nije ukljucena.");
		}
		System.out.println("Tip ringle: " + this.tip);
		System.out.println("Jacina: " + this.jacinaRingle);
		System.out.println("Grejac: " + this.jacinaGrejaca + "kW.");
	}

}
