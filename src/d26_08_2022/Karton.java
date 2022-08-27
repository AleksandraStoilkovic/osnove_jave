package d26_08_2022;

public class Karton {
//	Kreirati klasu Karton koja ima:
//	tip kartona (crveni, zuti)
//	konstuktore za koje mislite da ce vam trebati
//	gettere i settere za karton
	
	private String tip;

	public Karton(String tip) {
		super();
		this.tip = tip;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
	
	
}
