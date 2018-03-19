package E1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class E1UserEntry {
	
	public static List<Integer> one = new ArrayList<Integer>();
	public static List<Integer> two = new ArrayList<Integer>();
	public static List<Integer> concat = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		askInteger();
			
	}
	
	
	public static void askInteger()
	{
		int i = 0;
		Scanner c = new Scanner(System.in);
		do
		{
			i = Integer.parseInt(c.nextLine());
			if( i != 0)
				one.add(i);
		}while(i != 0);
		do
		{
			i = Integer.parseInt(c.nextLine());
			if( i != 0)
				two.add(i);
		}while(i != 0);
				
		c.close();
	}
	
	public static void concatenate() {

		System.out.println("Valeur unique list 1 :");
		for(Integer i : one)
		{
			if(!concat.contains(i))
			{
				System.out.println(i);
				concat.add(i);
			}
		}
		System.out.println("Valeur unique list 2 :");
		for(Integer i : two)
		{
			System.out.println(i);
			concat.add(i);
		}
		System.out.println("Union:");
		for(Integer i : concat)
		{
			System.out.println(i);
		}
		
	}
	
}
