package d15_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//		Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

		stampajVrednostZa10Vecu(10);
		stampajVrednostZa10Vecu(6);
		stampajVrednostZa10Vecu(3);
		stampajVrednostZa10Vecu(9);
		stampajVrednostZa10Vecu(7);
	}
	public static void stampajVrednostZa10Vecu(int a) {
		int b = a*10;
		System.out.print(b + ", ");
	}

}
