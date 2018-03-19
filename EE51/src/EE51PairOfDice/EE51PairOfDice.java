package EE51PairOfDice;

/**
 * Classe repr�sentant une paire de d� qui sont initialis� lors de leur d�claration
 * @author Micky
 *
 */
public class EE51PairOfDice implements I_EE51PairOfDice{
	private int die1;
	private int die2;
	
	/**
	 * Roll permet de lancer les deux d�s. Une valeur entre 1 et 6 est affect� aux deux d�s.
	 */
	@Override
	public void roll()
	{
		die1 = (int)(Math.random()*6+1);
		die2 = (int)(Math.random()*6+1);
	}
	
	/**
	 * @return la valeur du d� 1 (die1)
	 */
	@Override
	public int getDie1()
	{
		return die1;
	}
	/**
	 * 
	 * @return la valeur du d� 2 (die2)
	 */
	@Override
	public int getDie2()
	
	{
		return die2;
	}
	
	/**
	 * @return retourne une description de l'�tat de l'objet EE51PairOfDice
	 */
	@Override
	public String ToString()
	{
		return new String("Cette objet contient deux d�s. Le d� 1 � pour valeur "+die1+" et le d� 2 � pour valeur "+die2);
	}
	
	/**
	 * Constructeur de EE51PairOfDice et effectue un premier lancer pour initialiser les deux d�s;
	 */
	public EE51PairOfDice()
	{
		roll();
	}
	/**
	 * 
	 * @param value
	 * 		est la valeur attendu en aditionnant les deux d�s. Valeur comprise entre 2 et 12 inclus.
	 * @return cpt
	 * 			le nombre de lancer n�cessaire � obtenir le score d�sir�
	 * 	
	 */
	@Override
	public int CountRoll(int value)
	{
		if(value < 2 || value > 12)
		{
			throw new IllegalArgumentException("La valeur de 2 d� doit �tre comprise entre 2 et 12");
		}
		int cpt = 0;
		do {
			roll();
			cpt++;
		} while (value != die1+die2);
		
		return cpt;
	}
}
