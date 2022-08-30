package miniprojekat;

public class Player {

//Kreirati klasu Player koja ima:
//ime i prezime
//gettere i settere
//konstuktore
//metodu print, koja stampa ime i prezime igraca

	private String imeIPrezime;

	public Player(String imeIPrezime) {
		super();
		this.imeIPrezime = imeIPrezime;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public void print() {
		System.out.print(this.imeIPrezime);
	}
}
