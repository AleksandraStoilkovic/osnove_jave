package d25_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se brojevi unose u tim granicama. 
//		Znaci nije vam potrebna provera za opseg brojeva.
//
//		Za potrebe Lotto igre na srecu potrebno je 
//		Kreirati klasu Kombinacija koja ima:
//		id kombinacije (String)
//		niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//		konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//		gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//		metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija. 
//		Zaglavlje metode je:
//		public boolean daLiJeIstaKombinacija( Kombinacija k)
//		metoda vraca true ako su svi elementi na istim pozicija isti
//		npr: this [0] == k [0], this [1] == k [1] …. 
//		metodu za stampu koja stampa podatke u formatu
//		ID: id kombinacije
//		brojevi: 1, 3, 5, 14, 15, 21, 23
//
//
//			Kreirati klasu Listic koja ima: 
//		niz kombinacija - maksimalno 7 kombinacija
//		metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//		metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za proveru. 
//		Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji prosledjena kombinacija. 
//		Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
//		Zaglavlje metode 
//		public boolean dobitna(Kombinacija dobitnaKombinacija)
//		metodu koja stampa listic u formatu
//		ID: id kombinacije
//		brojevi: 1, 3, 5, 14, 15, 21, 23
//
//		ID: id kombinacije
//		brojevi: 1, 3, 5, 14, 15, 21, 23
//
//		…… i tako za sve kombinacije
		
		Listic l = new Listic();
		Kombinacija prva = new Kombinacija("7683", 4, 9, 13, 16, 28, 33, 35);
		Kombinacija druga = new Kombinacija("8793", 3, 6, 12, 18, 24, 38, 39);
		Kombinacija treca = new Kombinacija("6553", 8, 9, 15, 17, 23, 32, 37);
		Kombinacija cetvrta = new Kombinacija("0123", 1, 3, 9, 15, 24, 37, 38);
		Kombinacija peta = new Kombinacija("5645", 2, 9, 18, 19, 23, 34, 36);
		Kombinacija sesta = new Kombinacija("8766", 5, 8, 17, 18, 24, 31, 35);
		Kombinacija sedma = new Kombinacija("7567", 2, 7, 11, 17, 29, 32, 38);
		Kombinacija osma = new Kombinacija("7878", 4, 9, 13, 16, 28, 33, 35);
		l.dodajKombinaciju(prva);
		l.dodajKombinaciju(druga);
		l.dodajKombinaciju(treca);
		l.dodajKombinaciju(cetvrta);
		l.dodajKombinaciju(peta);
		l.dodajKombinaciju(sesta);
		l.dodajKombinaciju(sedma);
		l.dodajKombinaciju(osma);
		l.print();
		System.out.println("Postoji ista kombinacija: " + l.daLiPostojiIsta(osma));
	



	}

}
