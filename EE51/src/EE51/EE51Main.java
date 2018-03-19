package EE51;

import EE51PairOfDice.EE51PairOfDice;

public class EE51Main {
	static int d = 2;
	
	public static void main(String[] args) {
		
		EE51PairOfDice p = new EE51PairOfDice();
		System.out.println("Il faut "+p.CountRoll(d) + " pour obtenir le score " + d);
	}

}
