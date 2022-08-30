package miniprojekat;

import java.util.Scanner;

public class GlavniProgram {

	public static void main(String[] args) {
//		Glavni program (main):
//			Ucitati podatke za igrace
//			Kreirajte objekat klase XandOGame 
//			Startujte igru, tada je na potezu igrac X
//			Saveti za dobar zadatak
//			Igra treba da traje dok (while petlja)
//			nije kraj igre - imamo metodu za to
//			Ili dok ne dobijemo pobednika
//			U petlji
//			Trazimo od aktuelnog igraca da unese potez
//			Ukoliko je pozicija validna i ako je to slobodno mesto, igramo potez
//			Prebacujemo red na drugog igraca
//			Stampamo tablu
//			Ukoliko nije validna pozicija ili nije slobodno mesto stampamo poruku "You enter invalid position."
//			Nakon zavrsetka igre, racunamo skor i stampamo rezultat igre i podatke za igrace
		Scanner s = new Scanner(System.in);
		Player playerx = new Player("Jaric Zivadin");
		Player player0 = new Player("Jaric Zivadinka");
		Xand0game prva = new Xand0game(playerx, player0);
		prva.startGame();
		while(!prva.isGameOver() && !prva.isWinner0() && !prva.isWinnerX()) {
			System.out.print("Unesite poziciju:");
			int pozicija = s.nextInt();
			if(prva.isValidMove(pozicija) && prva.isFieldFree(pozicija)) {
			prva.makeAMove(pozicija);
			prva.playNext();
			prva.print();
			System.out.println();
		} else {
			System.out.println("You enter invalid position.");
		}	
		}
		
		if(prva.gameScore() == 1) {
			player0.print();
			System.out.println(":1");
			playerx.print();
			System.out.println(":0");
		} else if (prva.gameScore() == 2){
			playerx.print();
			System.out.println(":1");
			player0.print();
			System.out.println(":0");
		}  else {
			System.out.println("Game over.");
			playerx.print();
			System.out.println(":0");
			player0.print();
			System.out.println(":0");
		}

	}

}
