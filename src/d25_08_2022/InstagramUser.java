package d25_08_2022;

public class InstagramUser {
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

	private String username;
	private String imeIPrezime;
	private String email;
	public InstagramUser(String username, String imeIPrezime, String email) {
		this.username = username;
		this.imeIPrezime = imeIPrezime;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
