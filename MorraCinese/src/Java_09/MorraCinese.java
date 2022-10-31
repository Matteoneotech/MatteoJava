package Java_09;

public class MorraCinese {

	public static void main(String[] args) {
		String giocatoreA="carta";
		String giocatoreB="forbici";
		
		if(giocatoreA==giocatoreB) {
			System.out.println("Pareggio");
		} else {
			if(giocatoreA=="sasso"&&giocatoreB=="forbici") {
				System.out.println("Vince il primo giocatore");
			} else if (giocatoreA=="carta"&&giocatoreB=="sasso") {
				System.out.println("Vince il primo giocatore");
			} else if (giocatoreA=="forbici"&&giocatoreB=="carta") {
				System.out.println("Vince il primo giocatore");
			} else {
				System.out.println("Vince il secondo giocatore");
			}
		}
	}

}