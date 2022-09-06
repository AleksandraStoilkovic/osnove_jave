package d25_08_2022;

import java.util.ArrayList;

public class InstagramImage {
//	Kreirati klasu InstagramUser koja ima:
//		username
//		Ime i prezime
//		email
//		Sve sto vam dalje zatreba dopunite klasu.
//		Kreiarti klasu InstagramTag koja ima:
//		x koordinatu na slici
//		y koordinatu na slici
//		usera koji je tagovan
//		Kreirati klasu InstagramImage koja ima:
//		niz tagova
//		dimenziju slike
//		putanju do slike (npr: instagram.com/korsnik-pera/profilna.jpg)
//		metodu dodajTag
//
//		Kreirati klasu InstagramPost koja ima
//		niz slika
//		Opis koji moze da se postavi za post
//		metodu dodajSliku

	private ArrayList<InstagramTag> tagovi = new ArrayList<InstagramTag>();
	private String dimenzija;
	private String putanja;
	
	
	public InstagramImage(String dimenzija, String putanja) {
		this.dimenzija = dimenzija;
		this.putanja = putanja;
	}



	public String getDimenzija() {
		return dimenzija;
	}



	public void setDimenzija(String dimenzija) {
		this.dimenzija = dimenzija;
	}



	public String getPutanja() {
		return putanja;
	}



	public void setPutanja(String putanja) {
		this.putanja = putanja;
	}



	public ArrayList<InstagramTag> getTagovi() {
		return tagovi;
	}



	public void dodajTag(InstagramTag tag) {
		this.tagovi.add(tag);
	}
}
