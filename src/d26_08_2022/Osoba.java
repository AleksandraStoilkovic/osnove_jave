package d26_08_2022;

public class Osoba {
//	Kreirati klasu Osoba koja ima:
//	ime i prezime
//	jmbg
//	godinu rodjenja
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere 
//	metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)
	
	protected String imeIPrezime;
	protected String jmbg;
	protected int godRodjenja;
	public Osoba() {
	}

	public Osoba(String imeIPrezime, String jmbg, int godRodjenja) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.jmbg = jmbg;
		this.godRodjenja = godRodjenja;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public int getGodRodjenja() {
		return godRodjenja;
	}
	public void setGodRodjenja(int godRodjenja) {
		this.godRodjenja = godRodjenja;
	}
	
	public void print() {
		System.out.println(this.imeIPrezime + ", " + this.jmbg + ", " + this.godRodjenja );
	}
	
}
