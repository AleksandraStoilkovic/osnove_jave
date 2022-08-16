package d15_08_2022;

public class Zadatak7 {

	public static void main(String[] args) {
//		Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

		System.out.println("Najmanji je broj: " + minimunOdTriBroja(2, -1, 6));
		System.out.println("Najmanji je broj: " + minimunOdTriBroja(-4, -2, 0));
		System.out.println("Najmanji je broj: " + minimunOdTriBroja(10, 5, 7));

	}
		public static int minimunOdTriBroja(int a, int b, int c) {
			return Math.min(Math.min(a, b), c);
		}
}
