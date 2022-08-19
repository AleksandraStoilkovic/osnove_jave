package d19_08_2022;

public class FacebookPost {
//	Kreirati klasu FacebookPost koja ima:
//	   Od atributa:
//	ime i prezime korisnika koji je objavio post
//	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na 
//			tudjem profilu)
//	tekst objave
//	broj lajkova
//	broj deljenja
//	 Konstruktore:
//	difoltni konstuktor
//	konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu objavnljen i 
//	tekst objave
//	  Od metoda:
//	like(), koja povecava broj lajkova za 1.
//	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//	share(), koja povecava broj deljenja za 1
//	print(), koja stampa objavu u formatu:
//	(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//	(tekst objave)
//	Likes (broj lajkova) | Shares (broj deljenja)
//
//	U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//	Primer stampanja:
//	Milan Jovanovic >>> Pera Peric
//	Ovo je tekst objave
//	Likes 3 | Shares 1
	private String imeIPrezimeObjavio;
	private String imeIPrezimeObjavljeno;
	private String tekst;
	private int brojLajkova;
	private int brojDeljenja;
	
	public FacebookPost(){
		
	}
	public FacebookPost(String imeIPrezimeObjavio, String imeIPrezimeObjavljeno, String tekst) {
		this.imeIPrezimeObjavio = imeIPrezimeObjavio;
		this.imeIPrezimeObjavljeno = imeIPrezimeObjavljeno;
		this.tekst = tekst;
	}

	public void like() {
		this.brojLajkova++;
	}

	public void dislike() {
		if (this.brojLajkova > 0) {
			this.brojLajkova--;
		}
	}

	public void share() {
		this.brojDeljenja++;
	}

	public void print() {
		System.out.println(getImeIPrezimeObjavio() + " >>> " + getImeIPrezimeObjavljeno());
		System.out.println(getTekst());
		System.out.println("Likes " + getBrojLajkova() + " | Shares " + getBrojDeljenja());
	}
	public void setImeIPrezimeObjavio(String imeIPrezimeObjavio) {
		this.imeIPrezimeObjavio = imeIPrezimeObjavio;
	}
	public void setImeIPrezimeObjavljeno(String imeIPrezimeObjavljeno) {
		this.imeIPrezimeObjavljeno=imeIPrezimeObjavljeno;
	}
	public void setTekst(String tekst) {
		this.tekst= tekst;
	}
	public void setBrojLajkova(int brojLajkova) {
		this.brojLajkova = brojLajkova;
	}
	public void setBrojDeljenja(int brojDeljenja) {
		this.brojDeljenja = brojDeljenja;
	}
	public String getImeIPrezimeObjavio() {
		return this.imeIPrezimeObjavio;
	}
	public String getImeIPrezimeObjavljeno() {
		return this.imeIPrezimeObjavljeno;
	}
	public String getTekst() {
		return this.tekst;
	} 
	public int getBrojLajkova() {
		return this.brojLajkova;
	}
	public int getBrojDeljenja() {
		return this.brojDeljenja;
	}
}
