package MyPackageEE43;
public class EE43RollingDices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nombre de lancer pour un snake eyes : " + rolls(2));

		// Code commenter pour une généralisation

		// Scanner r = new Scanner(System.in);
		// System.out.println("Score voulu : ");
		// System.out.println("Nombre de lancer pour obtenir " +
		// ));Integer.parseInt(r.nextLine());

	}

	/**
	 * rolls est une fonction qui lance deux dés jusqu'à obtenir le nombre voulu
	 * passé en parametre
	 * 
	 * @param score
	 *            le score que l'on veut obtenir
	 * @return cpt le nombre d'essai avant d'obtenir le score voulu
	 */
	public static int rolls(int score) {
		// Lancer 2 dés donne un score entre 2 et 12. On lance une exception sinon
		if (score < 2 || score > 12) {
			throw new IllegalArgumentException("Le score voulu doit être entre 2 et 12 inclus");
		}
		// Déclaration des variables
		int d1, d2, cpt = 0;

		// Lance deux dé tant que la somme des deux dés n'est pas égale au score voulu
		do {
			d1 = (int) (Math.random() * 6.0 + 1);
			d2 = (int) (Math.random() * 6.0 + 1);
			cpt++;
		} while (d1 + d2 != score);

		return cpt;
	}

}
