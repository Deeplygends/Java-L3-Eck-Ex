package MyPackageEE43;
public class EE43RollingDices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nombre de lancer pour un snake eyes : " + rolls(2));

		// Code commenter pour une g�n�ralisation

		// Scanner r = new Scanner(System.in);
		// System.out.println("Score voulu : ");
		// System.out.println("Nombre de lancer pour obtenir " +
		// ));Integer.parseInt(r.nextLine());

	}

	/**
	 * rolls est une fonction qui lance deux d�s jusqu'� obtenir le nombre voulu
	 * pass� en parametre
	 * 
	 * @param score
	 *            le score que l'on veut obtenir
	 * @return cpt le nombre d'essai avant d'obtenir le score voulu
	 */
	public static int rolls(int score) {
		// Lancer 2 d�s donne un score entre 2 et 12. On lance une exception sinon
		if (score < 2 || score > 12) {
			throw new IllegalArgumentException("Le score voulu doit �tre entre 2 et 12 inclus");
		}
		// D�claration des variables
		int d1, d2, cpt = 0;

		// Lance deux d� tant que la somme des deux d�s n'est pas �gale au score voulu
		do {
			d1 = (int) (Math.random() * 6.0 + 1);
			d2 = (int) (Math.random() * 6.0 + 1);
			cpt++;
		} while (d1 + d2 != score);

		return cpt;
	}

}
