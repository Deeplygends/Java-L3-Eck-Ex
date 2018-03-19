package EE52;

import java.util.Scanner;

import EE52StatCalc.EE52StatCalc;

public class EE52Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EE52StatCalc calc = new EE52StatCalc();
		Scanner s = new Scanner(System.in);
		double n;
		do {
			n = Double.parseDouble(s.nextLine());
			System.out.println("Entrer un nombre dans le jeu de donnes (0 pour quitter): ");
			if(n != 0)
			{
				calc.enter(n);
			}
		} while (n != 0);
		
		System.out.println("Dans les statistiques nous avons :");
		System.out.println("    - "+calc.getCount()+" éléments ajoutés");
		System.out.println("    - La somme de ces éléments est : "+calc.getSum());
		System.out.println("    - La déviation stantdart de ces éléments est : "+calc.getStandardDeviation());
		System.out.println("    - La moyenne de ces éléments est : "+calc.getMean());
		System.out.println("    - Le maximum du jeu de données est : "+calc.getMax());
		System.out.println("    - Le minimum du jeu de données est : "+calc.getMin());
		
		s.close();
		
		
	}

}
