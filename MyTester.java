package mycalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTester {

	@Test
	public void testNfactorial() { // testing positive numbers > 1
		MyCalculator calcu = new MyCalculator();
		int actual = calcu.nfactorial(6); // 6! = 720
		
		assertEquals("6!=720",720,actual,0.0);
	}

	public void testNfactorial2() { // testing positive numbers > 1
		MyCalculator calcu = new MyCalculator();
		int actual = calcu.nfactorial(4); // 4! = 24
		
		assertEquals("4!=24",24,actual,0.0);
	}
	
	public void testNfactorialAt1() { // testing 1!
		MyCalculator calcu = new MyCalculator();
		int actual = calcu.nfactorial(1); // 1!=1
		
		assertEquals("1!=1",1,actual,0.0);
	}

	public void testNfactorialAt0() { //testing 0!
		MyCalculator calcu = new MyCalculator();
		int actual = calcu.nfactorial(0); // 0!=1
		
		assertEquals("0!=1",1,actual,0.0);
	}
	

	public void testNfactorialAtNegative() { //testing negative numbers
		MyCalculator calcu = new MyCalculator();
		int actual = calcu.nfactorial(-4); // -4!=1
		
		assertEquals("-4!=1",1,actual,0.0);
	}
	
	public void testNfactorialAtMax() { //testing max value, i.e., 12!
		MyCalculator calcu = new MyCalculator();
		int actual = calcu.nfactorial(12); // 12!=479001600
		
		assertEquals("12!=479001600",479001600,actual,0.0);
	}

	public void testNfactorialAboveMax() { //testing above max value, i.e., > 12
		MyCalculator calcu = new MyCalculator();
		int actual = calcu.nfactorial(13); // 13! is above the max value of int
		
		assertEquals("ABOVE MAX VALUE!",1,actual,0.0);
	}
	

	@Test
	public void testBinarySearch() { //normal test cases
		MyCalculator calcu = new MyCalculator();
		int[] array = new int[]{5,4,7,2,8};
		int location = calcu.binarySearch(array, 4); //location=1
		assertEquals("Located at index 1",1,location,0.0);
	}
	
	public void testBinarySearch2() { //normal test cases
		MyCalculator calcu = new MyCalculator();
		int[] array = new int[]{5,4,7,2,8};
		int location = calcu.binarySearch(array, 2); //location=0
		assertEquals("Located at index 0",0,location,0.0);
	}
	
	public void testBinarySearchNotInArray() { //not located
		MyCalculator calcu = new MyCalculator();
		int[] array = new int[]{5,4,7,2,8};
		int location = calcu.binarySearch(array, 6); //location=-1, not located
		assertEquals("Not located",-1,location,0.0);
	}
	
	public void testBinarySearchEmptyArray() { //empty array
		MyCalculator calcu = new MyCalculator();
		int[] array = new int[]{};
		int location = calcu.binarySearch(array, 6); //location=-1, not located
		assertEquals("Empty array",-1,location,0.0);
	}
	
	public void testBinarySearchOneElement() { //one element in array
		MyCalculator calcu = new MyCalculator();
		int[] array = new int[]{5};
		int location = calcu.binarySearch(array, 5); //location=0
		assertEquals("Located at index 0",0,location,0.0);
	}

}
