/*

Q] Write a Java program to calculate the sum of two numbers entered by the user.

-Learnt that public data members of class must be declared as static to be used in a static method

*/

import java.util.*;

class Sum
{
	Scanner sc = new Scanner(System.in);
	public static int num1,num2;
	Sum()
	{
		System.out.println("Enter 2 numbers: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
	}
	public int calculate()
	{
		int sum;
		sum=num1+num2;
		return sum;
	}
	public static void main(String args[])
	{
		Sum s1 = new Sum();
		int ans=s1.calculate();
		System.out.println("Sum of "+num1+"+"+num2+"="+ans);
	}
}