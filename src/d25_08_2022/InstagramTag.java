package d25_08_2022;

public class InstagramTag {
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

	private int x;
	private int y;
	private InstagramUser user;
	public InstagramTag(int x, int y, InstagramUser user) {
		super();
		this.x = x;
		this.y = y;
		this.user = user;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public InstagramUser getUser() {
		return user;
	}
	public void setUser(InstagramUser user) {
		this.user = user;
	}
	
	
}
