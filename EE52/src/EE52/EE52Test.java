package EE52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import EE52StatCalc.EE52StatCalc;

class EE52Test {
	static EE52StatCalc calc = new EE52StatCalc();
	
	@Test
	void StatCalcTest() {
		for(int i = 1; i< 5; i++)
		{
			calc.enter(i);
		}
		
		assertEquals(10, calc.getSum());
		assertEquals(4, calc.getCount());
		assertEquals(10.0/4.0, calc.getMean());
		assertEquals(4, calc.getMax());
		assertEquals(1, calc.getMin());
		
	}

}
