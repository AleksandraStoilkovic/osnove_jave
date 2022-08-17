package d16_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu 
//		u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//		Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//		Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012

		Proizvod kafa = new Proizvod();
		kafa.naziv = "c kafa";
		kafa.cena = 250;
		kafa.tezina = 200;
		kafa.stampaj();
		System.out.println("Konvertovana tezina u kilogramima je: " + kafa.konvertuj("kg") + "kg.");
		
		Proizvod secer = new Proizvod();
		secer.naziv = "crvenka secer";
		secer.cena = 90;
		secer.tezina = 1000;
		secer.stampaj();
		System.out.println("Konvertovana tezina u kilogramima je: " + secer.konvertuj("kg") + "kg, a u tonama " + 
		secer.konvertuj("t") + "t.");
	}

}
