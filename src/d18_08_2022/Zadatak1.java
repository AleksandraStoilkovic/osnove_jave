package d18_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. 
//		Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//		vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda 
//		kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//		racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. 
//		Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din
	//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

		Proizvod kafa = new Proizvod();
		kafa.naziv = "c kafa";
		kafa.cena = 250;
		kafa.tezina = 200;
		kafa.stampaj();
		System.out.println("Konvertovana tezina u kilogramima je: " + kafa.konvertuj("kg") + "kg.");
		kafa.povecajCenu(25);
		System.out.println("Sa popustom od 12.5% kafa ima novu cenu od " + kafa.vratiCenuSaPopustom(12.5) + "din.");
		System.out.println("Postarina za ovaj proizvod bi iznosila " + kafa.racunajPostarinu()+ "din.");
		
		Proizvod secer = new Proizvod();
		secer.naziv = "crvenka secer";
		secer.cena = 90;
		secer.tezina = 1000;
		secer.stampaj();
		System.out.println("Konvertovana tezina u kilogramima je: " + secer.konvertuj("kg") + "kg, a u tonama " + 
		secer.konvertuj("t") + "t.");
		secer.povecajCenu(13);
		System.out.println("Sa popustom od 20% kafa ima novu cenu od " + secer.vratiCenuSaPopustom(20) + "din.");
		System.out.println("Postarina za ovaj proizvod bi iznosila " + secer.racunajPostarinu() + "din.");
	}

}
