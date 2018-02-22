package MyPackageEE47;

import java.util.Scanner;

public class EE47Main {

	private static int[] nb1;
	private static int[] nb2;
	private static int[] answer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 10;
		nb1 = new int[size];
		nb2 = new int[size];
		answer = new int[size];
		generateQuizz(size);
		quizz(size);
		grade(size);
	}

	/**
	 * generateQuizz permet de générer un quizz d'un nombre de questions donné (qui
	 * doit être non null et positive)
	 * 
	 * @param size
	 *            est le nombre de questions qui composent le quizz (doit être
	 *            positif non nul)
	 */
	public static void generateQuizz(int size) {
		if (size <= 0) {
			throw new IllegalArgumentException("La taille du quizz doit être un entier positif non nul");
		}
		for (int i = 0; i < size; i++) {
			nb1[i] = (int) (Math.random() * 50 + 1);
			nb2[i] = (int) (Math.random() * 50 + 1);
			answer[i] = 0;
		}

	}

	/**
	 * quizz est une fonction qui administre le quizz à l'utilisateur et met à jour
	 * la variable global answer
	 * 
	 * @param size
	 *            est le nombre de question du quizz
	 */
	public static void quizz(int size) {
		Scanner r = new Scanner(System.in);
		System.out.println("Commençons le quizz");
		for (int i = 0; i < size; i++) {
			System.out.println("Question " + (i + 1) + " : " + nb1[i] + " + " + nb2[i] + " = ?");
			answer[i] = Integer.parseInt(r.nextLine());

			if (answer[i] == nb1[i] + nb2[i]) {
				System.out.println("Great ! 10 points pour Gryffondor");
			} else {
				System.out.println("Echec ! la réponse etait : " + (nb1[i] + nb2[i]));
			}
		}
		r.close();
	}

	/**
	 * grade permet de calculer le nombre de points accumulé par l'utilisateur à ce
	 * quizz
	 * 
	 * @param size
	 *            est le nombre de question du quizz
	 */
	public static void grade(int size) {
		int score = 0;
		for (int i = 0; i < size; i++) {
			if (answer[i] == nb1[i] + nb2[i]) {
				score += 10;
			}
		}

		System.out.println("Votre score est " + score + "/100");
	}

}
