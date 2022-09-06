package d22_08_2022;

public class Video {
//	Kreirati klasu Video koja ima:
//		svi atributi su private
//		id videa - koji je string i na primer izgleda v6tuOipj5mk
//		naziv videa
//		duzinu videa u sekundama (npr: ako je video 2min i 10s, duzina je 130)
//		broj lajkova
//		broj dislajkova
//		broj pregleda
//		metodu lajkuj - koja povecava broj lajkova za jedan
//		metodu dislajkuj - koja povecava broj dislajkova za jedan
//		metodu pogledaj - koja povecava broj pregleda za jedan
//		gettere za sve atribute
//		settere nemamo

	private String id;
	private String naziv;
	private int duzina;
	private int brojLajkova;
	private int brojDislajkova;
	private int brojPregleda;
	public Video(String id, String naziv, int duzina) {
		this.id = id;
		this.naziv = naziv;
		this.duzina = duzina;
		this.brojLajkova = 0;
		this.brojDislajkova = 0;
		this.brojPregleda = 0;
	}
	public String getId() {
		return id;
	}
	public String getNaziv() {
		return naziv;
	}
	public int getDuzina() {
		return duzina;
	}
	public int getBrojLajkova() {
		return brojLajkova;
	}
	public int getBrojDislajkova() {
		return brojDislajkova;
	}
	public int getBrojPregleda() {
		return brojPregleda;
	}
	
	public void lajkuj() {
		this.brojLajkova++;
	}
	public void dislajkuj(){
		this.brojDislajkova++;
	}
	public void pogledaj(){
		this.brojPregleda++;
	}
}
