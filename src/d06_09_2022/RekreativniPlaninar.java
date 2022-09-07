package d06_09_2022;

public class RekreativniPlaninar extends Planinar {
//	(20 poena) Kreirati klasu ​RekreativniPlaninar​ koja nasleđuje klasu Planinar. Klasa dodatno pamti još neke 
//	informacije koje se ne mogu menjati nakon postavljanja u konstuktoru: 
//	težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg) 
//	naziv okruga odakle je rekreativni planinar. 
//	maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//	da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine 
//	planine, s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara 
//	manje. 
//	rekeativci placaju clanarinu u iznosu od 1000 rsd
//	metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu: 
//	Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug) 
	
	protected int tezinaOpreme;
	protected String nazivOkruga;
	protected int maxUspon;
	public RekreativniPlaninar(int id, String imeIprezime, int tezinaOpreme, String nazivOkruga, int maxUspon) {
		super(id, imeIprezime);
		this.tezinaOpreme = tezinaOpreme;
		this.nazivOkruga = nazivOkruga;
		this.maxUspon = maxUspon;
	}
	@Override
	public void stampaj() {
		System.out.println("Rekreativac, id: " + this.id + " ime: " + this.imeIprezime + " Okrug: " + this.nazivOkruga);
		
	}
	@Override
	public double clanarina() {
		return 1000;
	}
	@Override
	public boolean uspesanUspon(Planina p) {
		 return this.maxUspon - this.tezinaOpreme*50 > p.getVisina();
	}
	
}
