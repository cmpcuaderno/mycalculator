package mycalculator;

/**
 * Author: Kristine Elaine P. Bautista
 * Program Description: Calculator of Simple Mathematical Functions
**/

public class MyCalculator {
	// add two numbers
	public float add(float a,float b){
		return a+b;
	}
	
	// subtract two numbers
	public float subtract(float a,float b){
		return a-b;
	}
	
	// multiply two numbers
	public float multiply(float a,float b){
		return a*b;
	}
	
	// divide two numbers
	public float divide(float a,float b){
		return a/b;
	}
	
	// x^2 of two numbers
	public float square(int x){
		return x*x;
	}
	
	// x^3 of three numbers
	public float cube(int x){
		return x*x*x;
	}
	
	// n! of an integer
	public int nfactorial(int n){
		if(n>12) return 1; // 13! is greater than the max value of int
		int factorial = 1;
		
		for(int i=1;i<=n;i++) // number itself must be included, thus i<=n
			factorial *= i;
		
		return factorial;
	}
	
	// binary search in an array
	int binarySearch(int[] a,int x){
		int swap;
		int n = a.length; // get number of elements in the array
		if(n<1) return -1;
		
		//sorting
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(a[i] > a[j]){
					swap = a[i];
					a[i] = a[j];
					a[j] = swap;
				}
			}
		}
		
		int lower, upper, middle; // variables for positions in the array
		lower = 0; upper = n-1; // initialize values of lower and upper points
		
		while(lower<=upper){
			middle = (lower+upper)/2;
			if(x>a[middle]) lower = middle + 1;
			else if(x<a[middle]) upper = middle - 1;
			else return middle;
		}
		
		return -1;
	}
	
}
