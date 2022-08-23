package d22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.

		
		Autor autor = new Autor("John", "Tolkin");
		autor.print();
		Autor autor1 = new Autor("J.K." , "Rowling");
		autor1.print();
		Knjiga prva = new Knjiga("9780395647987", "The Lord Of The Rings", 1992, autor);
		prva.print();
		Knjiga druga = new Knjiga("9780007136568", "The Two Towers", 2002, autor);
		druga.print();
		Knjiga prva1= new Knjiga("9780001912366", "Harry Potter and the Sorcerers Stone", 2003, autor1);
		prva1.print();
	}

}
