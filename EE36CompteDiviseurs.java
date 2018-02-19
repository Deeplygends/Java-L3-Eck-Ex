import java.util.*;

public class EE36CompteDiviseurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<Integer>();
		int max = 1, count;
		
		for(int i = 2; i <= 10000; i++)
		{
			count = 0;
			for(int j = 1; j < i+1; j++)
			{
				if(i%j == 0)
				{
					count++;
				}
			}
			if(count >= max)
			{
				if(count > max)
				{
					l.clear();
					max = count;
				}
				
				l.add(i);
			}
			
		}
		System.out.println("Nombre Max de diviseurs : "+ max);
		System.out.println("Listes de nombres");
		for(int i : l)
		{
			System.out.print(i + " - ");
		}
	}

}
