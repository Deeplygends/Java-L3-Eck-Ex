import java.util.Scanner;

public class EE47Quizz {

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
	
	public static void generateQuizz(int size)
	{
			for(int i = 0; i<size; i++)
			{
				nb1[i] = (int)(Math.random()*50+1);
				nb2[i] = (int)(Math.random()*50+1);
				answer[i] = 0;
			}
	
	}
	
	public static void quizz(int size)
	{
		Scanner r = new Scanner(System.in);
		System.out.println("Commençons le quizz");
		for(int i = 0; i<size; i++)
		{
			System.out.println("Question " +(i+1) + " : "+nb1[i]+" + "+nb2[i]+ " = ?");
			answer[i] = Integer.parseInt(r.nextLine());
			
			if(answer[i] == nb1[i] + nb2[i])
			{
				System.out.println("Great ! 10 points pour Gryffondor");
			}
			else
			{
				System.out.println("Echec ! la réponse etait : " +(nb1[i]+nb2[i]));
			}
		}
		r.close();
	}
	
	public static void grade(int size)
	{
		int score = 0;
		for(int i = 0; i<size;i++)
		{
			if(answer[i] == nb1[i] + nb2[i])
			{
				score+=10;
			}
		}
		
		System.out.println("Votre score est " + score+"/100");
	}
}
