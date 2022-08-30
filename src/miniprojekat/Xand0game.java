package miniprojekat;

import java.util.ArrayList;

public class Xand0game {

//Kreirati klasu XandOGame koja ima:
//table - niz koji cuva stanje igre. Npr: table = x, x, 0, 0, x, 0, x, 0, x
//nextPlayer - atribut koji cuva informaciju ko igra sledeci. Moze da ima vrednosti x ili o
//playerX - igrac X
//playerO - igrac O
//Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je “ “
//Kontuktor koji prima dva parametra, igraca x i igraca o i ovaj kontuktor radi sve sto radi i difoltni samo sto dodatno postavlja i igraca
//gettere i settere za igrace
//Metodu print koja stampa tablu sliku kao na slici. Stampanje se vrsi petljom. Ako je niz iz primera iznad stampa izgleda:
//x | x | 0 |
//0 | x | 0 |
//x | 0 | x |
//
//Metodu startGame, metoda postavlja sve elemente niza na prazan string “ “ i zatim postavlja da je na redu igrac X.
//Metodu isGameOver, igra je gotova ako su sva polja popunjena.
//Metodu isFieldFree, koja vraca da li je trazeno polje slobodno. Metoda od parametara prima niz i poziciju za kojju se proverava. Polje je slobodno ako u njemu ne pise x ili o
//Metodu playNext, metoda prebacuje potez na sledeceg igraca, ako je bio igrac x prebacuje ga na o i obrnuto
//Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.
//Ako je trenutno stanje u igri i sledeci na redu je igrac x
//x | x | 0 |
//0 |   |   |
//x |   |   |
//I pozove se metoda makeAMove za poziciju 5, novo stanje u igri je 
//x | x | 0 |
//0 |   | x |
//x |   |   |
//Metodu isWinnerX - metoda vraca rezultat igre za igraca X. Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
//Metodu isWinnerO -  metoda vraca rezultat igre za igraca O. Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
//Metodu isValidMove koja vraca informaciju da li je pozicija na koju igrac zeli da odigra potez validna. Pozicija je validna ako je u opsegu od 0 do 8
//Metodu gameScore, metoda vraca informaciju za kraj igre.
//Ukoliko je pobednik igrac x, metoda vraca 1
//Ukoliko je pobednik igrac o, metoda vraca 2
//Ukoliko nemam pobednika vracamo 0

	private ArrayList<String> table = new ArrayList<String>();
	private Player nextPlayer;
	private Player playerx;
	private Player player0;

	public Xand0game() {
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
	}

	public Xand0game(Player playerx, Player player0) {
		this.playerx = playerx;
		this.player0 = player0;
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");

	}

	public Player getPlayerx() {
		return playerx;
	}

	public void setPlayerx(Player playerx) {
		this.playerx = playerx;
	}

	public Player getPlayer0() {
		return player0;
	}

	public void setPlayer0(Player player0) {
		this.player0 = player0;
	}

	public void print() {
		for (int i = 0; i < this.table.size(); i++) {
			System.out.print(this.table.get(i) + " | ");
			if (i == 2 || i == 5) {
				System.out.println();
			}
		}
	}

	public void startGame() {
		for (int i = 0; i < this.table.size(); i++) {
			this.table.set(i, " ");
		}
		this.nextPlayer = playerx;
	}

	public boolean isGameOver() {
		int brojac = 0;
		for (int i = 0; i < this.table.size(); i++) {
			if (this.table.get(i).equals("x") || this.table.get(i).equals("0")) {
				brojac++;
			}
		}
		return brojac == 9 ? true : false;
	}

	public boolean isFieldFree(int pozicija) {

		if (this.table.get(pozicija).equals("x") || this.table.get(pozicija).equals("0")) {
			return false;
		}
		return true;
	}

	public void playNext() {
		if (this.nextPlayer == playerx) {
			this.nextPlayer = player0;
		} else if (this.nextPlayer == player0) {
			this.nextPlayer = playerx;
		}
	}

	public void makeAMove(int pozicija) {

		if (this.nextPlayer == playerx) {
			this.table.set(pozicija, "x");
		} else if (this.nextPlayer == player0) {
			this.table.set(pozicija, "0");
		}
	}

	public boolean isWinnerX() {
		if ((this.table.get(0).equals("x") && this.table.get(1).equals("x") && this.table.get(2).equals("x"))
				|| (this.table.get(0).equals("x") && this.table.get(3).equals("x") && this.table.get(6).equals("x"))
				|| (this.table.get(2).equals("x") && this.table.get(5).equals("x") && this.table.get(8).equals("x"))
				|| (this.table.get(6).equals("x") && this.table.get(7).equals("x") && this.table.get(8).equals("x"))
				|| (this.table.get(3).equals("x") && this.table.get(4).equals("x") && this.table.get(5).equals("x"))
				|| (this.table.get(0).equals("x") && this.table.get(4).equals("x") && this.table.get(8).equals("x"))
				|| (this.table.get(2).equals("x") && this.table.get(4).equals("x") && this.table.get(6).equals("x"))
				|| (this.table.get(1).equals("x") && this.table.get(4).equals("x") && this.table.get(7).equals("x"))) {
			return true;
		}
		return false;
	}

	public boolean isWinner0() {
		if ((this.table.get(0).equals("0") && this.table.get(1).equals("0") && this.table.get(2).equals("0"))
				|| (this.table.get(0).equals("0") && this.table.get(3).equals("0") && this.table.get(6).equals("0"))
				|| (this.table.get(2).equals("0") && this.table.get(5).equals("0") && this.table.get(8).equals("0"))
				|| (this.table.get(6).equals("0") && this.table.get(7).equals("0") && this.table.get(8).equals("0"))
				|| (this.table.get(3).equals("0") && this.table.get(4).equals("0") && this.table.get(5).equals("0"))
				|| (this.table.get(0).equals("0") && this.table.get(4).equals("0") && this.table.get(8).equals("0"))
				|| (this.table.get(2).equals("0") && this.table.get(4).equals("0") && this.table.get(6).equals("0"))
				|| (this.table.get(1).equals("0") && this.table.get(4).equals("0") && this.table.get(7).equals("0"))) {
			return true;
		}
		return false;
	}

	public boolean isValidMove(int pozicija) {
		if (pozicija >= 0 && pozicija < 9) {
			return true;
		}
		return false;
	}

	public int gameScore() {
		if (isWinner0()) {
			return 1;
		} else if (isWinnerX()) {
			return 2;
		}
		return 0;
	}
}
