/*

Q] Create a Java program that checks whether a given number is even or odd.

-If two obj to be created, create second obj after operations on obj 1 are over..

*/

import java.util.*;

class EvenOdd
{
	public static int num;
	
	EvenOdd(int n)
	{
		this.num=n;
	}

	public void checkEvenOdd()
	{
		if(num%2==0)
		{
			System.out.println("Given number is even...");
		}
		else
		{
			System.out.println("Given number is odd...");
		}
	}

	public static void main(String args[])
	{
		EvenOdd obj1 = new EvenOdd(4);
		System.out.println("First number: ");
		obj1.checkEvenOdd();

		EvenOdd obj2 = new EvenOdd(5);
		System.out.println("Second number: ");
		obj2.checkEvenOdd();
	}	
}	