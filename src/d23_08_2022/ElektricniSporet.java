package d23_08_2022;

public class ElektricniSporet {
//	Kreirati klasu ElektricniSporet koja ima:
//	marku storeta (npr: Beko, Bosh)
//	garanciju kao broj godina
//	maksimalan broj ukljucenih ringli u istom trenutku (1, 2, 3  ili 4)
//	4 ringle 
//	gore levo
//	gore desno
//	dole levo
//	dole desno
//	konstruktor koji postavlja sve atribute
//	gettere za sve atribut
//	ne postoje setteri
//	metodu pojacaj kojoj se prosledjuje pozicija ringle
//	pozicija 1 je ringla gore levo
//	pozicija 2 je ringla gore desno
//	pozicija 3 je ringla dole levo
//	pozicija 4 je ringla dole desno
//	Ako se prelazi maksimalan broj ukljucenih ringli u jednom trenutku, pogasite sve ringle sem one koja se pojacava 
//	u tom pozivu funkije 
//	Za gasenje ringli iskoristite metodu koja je definisana ispod 👇
//	metodu iskljuci ringlu kojoj se prosledjuje pozicija ringle
//	pozicija 1 je ringla gore levo
//	pozicija 2 je ringla gore desno
//	pozicija 3 je ringla dole levo
//	pozicija 4 je ringla dole desno
//	metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet, tako sto sabira potrosnju za sve ringle 
//	(kao parametar se unosi vreme koliko vec ringle rade)
//	metodu koja stampa podatke u formatu:
//	marka - garancija u godinama
//	Ringle:
//	Gore levo:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
//	Gore desno:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
//	Dole levo:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
//	Dole desno:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
	private String marka;
	private int garancija;
	private int maxBrojUkljucenihRingli;
	private Ringla goreLevo;
	private Ringla goreDesno;
	private Ringla doleLevo;
	private Ringla doleDesno;
	public ElektricniSporet(String marka, int garancija, int maxBrojUkljucenihRingli, Ringla goreLevo, Ringla goreDesno,
			Ringla doleLevo, Ringla doleDesno) {
		this.marka = marka;
		this.garancija = garancija;
		this.maxBrojUkljucenihRingli = maxBrojUkljucenihRingli;
		this.goreLevo = goreLevo;
		this.goreDesno = goreDesno;
		this.doleLevo = doleLevo;
		this.doleDesno = doleDesno;
	}
	public String getMarka() {
		return marka;
	}
	public int getGarancija() {
		return garancija;
	}
	public int getMaxBrojUkljucenihRingli() {
		return maxBrojUkljucenihRingli;
	}
	public Ringla getGoreLevo() {
		return goreLevo;
	}
	public Ringla getGoreDesno() {
		return goreDesno;
	}
	public Ringla getDoleLevo() {
		return doleLevo;
	}
	public Ringla getDoleDesno() {
		return doleDesno;
	}

	public void pojacaj(Ringla pozicija1, Ringla pozicija2, Ringla pozicija3, Ringla pozicija4) {
		int ukljucene= 0;
		if(goreLevo.isUkljucena()) {
			ukljucene++;
		} if(goreDesno.isUkljucena()) {
			ukljucene++;
		}if(doleLevo.isUkljucena()) {
			ukljucene++;
		} if(doleDesno.isUkljucena()) {
			ukljucene++;
		} 
		if(ukljucene>this.maxBrojUkljucenihRingli) {
			this.iskljuciRinglu(pozicija1,pozicija2, pozicija3, pozicija4);
			
		}
		if(pozicija1!= null) {
			this.goreLevo.pojacajRinglu();
		}if(pozicija2!= null) {
			this.goreDesno.pojacajRinglu();
		}if(pozicija3!= null) {
			this.doleLevo.pojacajRinglu();
		}if(pozicija4!= null) {
			this.doleDesno.pojacajRinglu();
		} 
	}

	public void iskljuciRinglu(Ringla pozicija1, Ringla pozicija2, Ringla pozicija3, Ringla pozicija4){
		if(pozicija1!= null) {
			this.goreLevo.iskljuciRinglu();
		}if(pozicija2!= null) {
			this.goreDesno.iskljuciRinglu();
		}if(pozicija3!= null) {
			this.doleLevo.iskljuciRinglu();
		}if(pozicija4!= null) {
			this.doleDesno.iskljuciRinglu();
		} 
	}

	public double ukupnaPotrosnja(double vreme) {
		return this.goreLevo.potrosnja(vreme) + this.goreDesno.potrosnja(vreme) + this.doleLevo.potrosnja(vreme) + 
				this.doleDesno.potrosnja(vreme);
	}
	public void print() {
		System.out.println(this.marka + " - " + this.garancija);
	}
}
