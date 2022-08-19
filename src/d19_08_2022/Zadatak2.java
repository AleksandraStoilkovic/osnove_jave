package d19_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na 
//					tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			 Konstruktore:
//			difoltni konstuktor
//			konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu objavnljen i 
//			tekst objave
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
//
//			U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//			Primer stampanja:
//			Milan Jovanovic >>> Pera Peric
//			Ovo je tekst objave
//			Likes 3 | Shares 1


		FacebookPost rodjendan = new FacebookPost();
		rodjendan.setImeIPrezimeObjavio("Nikola Nikolic");
		rodjendan.setImeIPrezimeObjavljeno("Petar Petrovic");
		rodjendan.setTekst("Srecan rodjendan!");
		rodjendan.setBrojDeljenja(3);
		rodjendan.setBrojLajkova(2);
		rodjendan.like();
		rodjendan.dislike();
		rodjendan.like();
		rodjendan.dislike();
		rodjendan.like();
		rodjendan.like();
		rodjendan.share();
		rodjendan.share();
		rodjendan.print();

		FacebookPost slava = new FacebookPost("Ana Nikolic", "Milica Jovanovic", "Srecna slava!");
		slava.setBrojLajkova(9);
		slava.setBrojDeljenja(4);
		slava.like();
		slava.like();
		slava.like();
		slava.like();
		slava.like();
		slava.dislike();
		slava.dislike();
		slava.dislike();
		slava.share();
		slava.print();

	}

}
