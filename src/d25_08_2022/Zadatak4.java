package d25_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
//		Kreirati klasu InstagramUser koja ima:
//			username
//			Ime i prezime
//			email
//			Sve sto vam dalje zatreba dopunite klasu.
//			Kreiarti klasu InstagramTag koja ima:
//			x koordinatu na slici
//			y koordinatu na slici
//			usera koji je tagovan
//			Kreirati klasu InstagramImage koja ima:
//			niz tagova
//			dimenziju slike
//			putanju do slike (npr: instagram.com/korsnik-pera/profilna.jpg)
//			metodu dodajTag
//
//			Kreirati klasu InstagramPost koja ima
//			niz slika
//			Opis koji moze da se postavi za post
//			metodu dodajSliku
		
		InstagramUser user1= new InstagramUser("pajatrosak", "Paja Pandurovic", "pajasudnica1@gmail.com");
		InstagramTag tag1 = new InstagramTag(5, 3, user1);
		InstagramImage image1= new InstagramImage("1080x720", "https://www.slika.jpg");
		InstagramPost post1= new InstagramPost("Ja u sudu dok se branim.");
		post1.dodajSliku(image1);
		image1.dodajTag(tag1);

	}

}
