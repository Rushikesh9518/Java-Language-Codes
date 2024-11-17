package Java;

import java.util.Iterator;

public class FibonacciGenerator implements Iterator<Integer>{
	
	private int a=0,b=1;
	
	
	@Override
	public boolean hasNext() {
		// Fibonacci series is infinite,so it always has a next element 
		return true; 
	}
	
	@Override
	public Integer next() {
		
		int current = a;
		int next = a + b ;
		a = b;
		b = next;
		return current;
	}
	
	public static void main (String [] args) {
		
		FibonacciGenerator generator = new FibonacciGenerator();
		
		System.out.println("First 10 Fibonacci Numbers : ");
		for(int i = 0;i<10;i++) {
			System.out.print(generator.next() + " ");
		}
	}
	

}
