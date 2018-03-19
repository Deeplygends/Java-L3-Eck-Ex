package EE53;
import EE51PairOfDice.*;
import EE52StatCalc.*;
public class EE53StatDices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EE51PairOfDice e = new EE51PairOfDice();
		EE52StatCalc[] calcs = new EE52StatCalc[11];

		for (int j = 2; j <= 12; j++) {
			calcs[j-2] = new EE52StatCalc();
			for (int i = 0; i < 10000; i++) {
				calcs[j-2].enter((double)e.CountRoll(j));
			}
		}
		System.out.println("Statistiques sur les lancés");
		for (int i = 2; i <= 12; i++) {
			System.out.println("------------ Valeur "+i+" --------------");
			System.out.println("Nombre de lancers moyens : "+calcs[i-2].getMean());
			System.out.println("Deviation standard : "+calcs[i-2].getStandardDeviation());
			System.out.println("Nombre maximum de lances : "+calcs[i-2].getMax());
			
			
		}
	}

}
