package d25_08_2022;

import java.util.ArrayList;

public class InstagramPost {
//	Kreirati klasu InstagramUser koja ima:
//	username
//	Ime i prezime
//	email
//	Sve sto vam dalje zatreba dopunite klasu.
//	Kreiarti klasu InstagramTag koja ima:
//	x koordinatu na slici
//	y koordinatu na slici
//	usera koji je tagovan
//	Kreirati klasu InstagramImage koja ima:
//	niz tagova
//	dimenziju slike
//	putanju do slike (npr: instagram.com/korsnik-pera/profilna.jpg)
//	metodu dodajTag
//
//	Kreirati klasu InstagramPost koja ima
//	niz slika
//	Opis koji moze da se postavi za post
//	metodu dodajSliku
	
	private ArrayList<InstagramImage> slike = new ArrayList<InstagramImage>();
	private String opis;
	
	public void dodajSliku(InstagramImage slika) {
		this.slike.add(slika);
	}

	public InstagramPost(String opis) {
		super();
		this.opis = opis;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public ArrayList<InstagramImage> getSlike() {
		return slike;
	}
	
}
