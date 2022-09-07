package d06_09_2022;

import java.util.ArrayList;

public class Korpa {
//	Kreirati klasu Korpa koja ima:
//	niz ambalaza
//	metodu dodaj ambalazu
//	metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima
//	Super karticu iz koje se cita popust.

	private ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();

	public Korpa() {
		super();
	}

	public ArrayList<Ambalaza> getAmbalaze() {
		return ambalaze;
	}

	public void dodajAmbalazu(Ambalaza a) {
		this.ambalaze.add(a);
	}

	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < this.ambalaze.size(); i++) {
			if (barkod.equals(this.ambalaze.get(i).getBarkod())) {
				this.ambalaze.remove(i);
			}
		}
	}

	private double cenaSvihAmbalazaSaPopustom(double popust) {
		double suma = 0;
		for (int i = 0; i < this.ambalaze.size(); i++) {
			suma += this.ambalaze.get(i).cenaProizvoda();
		}
		return suma - popust;
	}

	public double cenaSvihAmbalazaSaPopustom(SuperKartica s) {
		return cenaSvihAmbalazaSaPopustom(s.getPopust());
	}
}
