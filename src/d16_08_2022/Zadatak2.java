package d16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za izabranu temperaturu 
//			atribut za mod (hladi/greje) - string
//			metodu za stampu (proizvoljno)
//			metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena. 
//			Metoda kao parametar prima temperaturu koja je napolju.
//
//
//			U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode
		
		SmartAirConditioning v1 = new SmartAirConditioning();
		v1.marka = "Merceredes";
		v1.temperatura = 19;
		v1.mod = "hladi";
		v1.stampaj();
		if (v1.tempOutHigh(22) == true) {
			System.out.println("Napolju je veca temperatura od one na koju je klima postavljena.");
		} else {
			System.out.println("Napolju je manja temperatura od one na koju je klima postavljena.");
		}
		
		SmartAirConditioning v2 = new SmartAirConditioning();
		v2.marka = "Audi";
		v2.temperatura = 23;
		v2.mod = "greje";
		v2.stampaj();
		if (v2.tempOutHigh(22) == true) {
			System.out.println("Napolju je veca temperatura od one na koju je klima postavljena.");
		} else {
			System.out.println("Napolju je manja temperatura od one na koju je klima postavljena.");
		}
		
	}

}
