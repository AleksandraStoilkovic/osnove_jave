package d25_08_2022;

import java.util.ArrayList;

public class Kombinacija {
//	Za potrebe Lotto igre na srecu potrebno je 
//	Kreirati klasu Kombinacija koja ima:
//	id kombinacije (String)
//	niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//	konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//	gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//	metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija. 
//	Zaglavlje metode je:
//	public boolean daLiJeIstaKombinacija( Kombinacija k)
//	metoda vraca true ako su svi elementi na istim pozicija isti
//	npr: this [0] == k [0], this [1] == k [1] …. 
//	metodu za stampu koja stampa podatke u formatu
//	ID: id kombinacije
//	brojevi: 1, 3, 5, 14, 15, 21, 23
	
	private String id;
	private ArrayList<Integer> brojevi = new ArrayList<Integer>();
	
	public Kombinacija(String id, int broj1, int broj2, int broj3, int broj4, int broj5, int broj6, int broj7) {
		this.id = id;
		this.brojevi.add(broj1);
		this.brojevi.add(broj2);
		this.brojevi.add(broj3);
		this.brojevi.add(broj4);
		this.brojevi.add(broj5);
		this.brojevi.add(broj6);
		this.brojevi.add(broj7);
	}

	public String getId() {
		return id;
	}

	public ArrayList<Integer> getBrojevi() {
		return brojevi;
	}
 
	public boolean provera(Kombinacija kombinacija) {
		int brojac=0;
		for(int i=0; i<this.brojevi.size(); i++) {
			if(this.brojevi.get(i).equals(kombinacija.brojevi.get(i))) {
				brojac++;
		}
	}
		if(brojac==7) {
			return true;
		}
		return false;
	}

	public void print() {
		System.out.println("ID: " + this.getId());
		for(int i=0; i<this.brojevi.size(); i++) {
			System.out.print(this.brojevi.get(i) + ", ");
			if(i==this.brojevi.size()-1){
				System.out.println(this.brojevi.get(i));
		}
	}
}
}