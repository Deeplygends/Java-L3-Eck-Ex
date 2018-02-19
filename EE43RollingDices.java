
public class EE43RollingDices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nombre de lancer pour un snake eyes : " + rolls(2));
		
		
	}
	
	public static int rolls(int score)
	{
		if(score < 2 || score > 12)
		{
			throw new IllegalArgumentException("Le score voulu doit être entre 2 et 12 inclus");
		}
		//Déclaration des variables
		int d1, d2, cpt=0;
		
		//Roll the dices
		do {
			d1 = (int) (Math.random()*6.0+1);
			d2 = (int) (Math.random()*6.0+1);
			cpt++;
		}while(d1+d2 != score);
		
		return cpt;
	}

}
