import java.util.Scanner;

public class EE34StringToWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       String line; 
	       int i;
	       Scanner r = new Scanner(System.in);
	       System.out.println("Entrer une phrase :");
	       line = r.nextLine();
	       
	       String[] mots = line.split(" ");
	       
	       for(i = 0; i < mots.length; i++)
	       {
	    	   System.out.println(mots[i]);
	       }
	       
	       r.close();
	}

}
