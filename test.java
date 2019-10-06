package hw6;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


class test {

	UnitTestHW instance; 
	@Test
	@BeforeEach
	void testInitialize() {
		instance = new UnitTestHW();
		assertEquals(0, instance.retrieveSum(), "not equal");
		assertEquals(0, instance.retrieveAverage(), "not equal");
		System.out.println("initialize Success");
		
		//succeeds
	}
	@Test
	void testMysteryMethod() {
		instance.MysteryMethod(1, 2);
		assertEquals(1, instance.retrieveSum(), "not equal");
		assertEquals(2, instance.retrieveAverage(), "not equal");
		System.out.println("mysteryMethod success.");
		
		//fails -- mysteryMethod initializes variables to 0 after setting them instead of before setting them
		
	}

	@Test
	void testAddNumberToList() {
		int i = 5;
		instance.addNumberToList(i);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(i);
		assertIterableEquals(expected, instance.retrieveList(), "not equal");
		System.out.println("addNumberToList success.");
		
		//succeeds
	}

	@Test
	void testRemoveNumberFromList() {
		int i = 5;
		instance.addNumberToList(i);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(i);
		instance.removeNumberFromList(4);
		assertIterableEquals(expected, instance.retrieveList(), "not equal");
		System.out.println("removeNumberFromList success.");
		
		//fails -- removeNumberFromList(int b) does not use b in method body
	}

	@Test
	void testComputeSum() {
		int i = 5;
		int j = 10;
		instance.addNumberToList(i);
		instance.addNumberToList(j);
		instance.computeSum();
		assertEquals(15, instance.retrieveSum(), "not equal");
		System.out.println("computeSum success.");
		
		//succeeds -- but only because I fixed the computeSum method so that it would
	}


}
