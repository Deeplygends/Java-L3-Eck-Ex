package EE51PairOfDice;

/**
 * Classe représentant une paire de dé qui sont initialisé lors de leur déclaration
 * @author Micky
 *
 */
public class EE51PairOfDice implements I_EE51PairOfDice{
	private int die1;
	private int die2;
	
	/**
	 * Roll permet de lancer les deux dés. Une valeur entre 1 et 6 est affecté aux deux dés.
	 */
	@Override
	public void roll()
	{
		die1 = (int)(Math.random()*6+1);
		die2 = (int)(Math.random()*6+1);
	}
	
	/**
	 * @return la valeur du dé 1 (die1)
	 */
	@Override
	public int getDie1()
	{
		return die1;
	}
	/**
	 * 
	 * @return la valeur du dé 2 (die2)
	 */
	@Override
	public int getDie2()
	
	{
		return die2;
	}
	
	/**
	 * @return retourne une description de l'état de l'objet EE51PairOfDice
	 */
	@Override
	public String ToString()
	{
		return new String("Cette objet contient deux dés. Le dé 1 à pour valeur "+die1+" et le dé 2 à pour valeur "+die2);
	}
	
	/**
	 * Constructeur de EE51PairOfDice et effectue un premier lancer pour initialiser les deux dés;
	 */
	public EE51PairOfDice()
	{
		roll();
	}
	/**
	 * 
	 * @param value
	 * 		est la valeur attendu en aditionnant les deux dés. Valeur comprise entre 2 et 12 inclus.
	 * @return cpt
	 * 			le nombre de lancer nécessaire à obtenir le score désiré
	 * 	
	 */
	@Override
	public int CountRoll(int value)
	{
		if(value < 2 || value > 12)
		{
			throw new IllegalArgumentException("La valeur de 2 dé doit être comprise entre 2 et 12");
		}
		int cpt = 0;
		do {
			roll();
			cpt++;
		} while (value != die1+die2);
		
		return cpt;
	}
}
