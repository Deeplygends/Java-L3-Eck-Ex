package EE51PairOfDice;


import org.junit.jupiter.api.Test;


class JTest {
	static EE51PairOfDice e = new EE51PairOfDice();
	
	@Test
	void testCountRoll() 
	{
		try
		{
			e.CountRoll(15);
		}
		catch(IllegalArgumentException r)
		{
			assert(r.getMessage().contains("La valeur de 2 dé doit être comprise entre 2 et 12"));
		}
	
	}

}
