/*

Q] Write a Java program to calculate the factorial of a given number.

*/

import java.util.*;

class Factorial
{
	private static int num,fact=1;

	Factorial(int n)
	{
		this.num=n;
	}

	public int findFactorial()
	{
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String args[])
	{
		Factorial obj = new Factorial(4);
		int ans=obj.findFactorial();
		System.out.println("Factorial of "+num+"="+ans);
	}
}