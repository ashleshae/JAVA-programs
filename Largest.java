/*

Q] Implement a Java program to find the largest among three numbers entered by the user.

*/

import java.util.*;

class Largest
{
	private int num1,num2,num3;
	Scanner sc = new Scanner(System.in);

	Largest()
	{
		System.out.println("Enter 3 numbers to compare: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
	}

	public void findLargest()
	{
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1+" is the largest number.");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println(num2+" is the largest number.");
		}
		else
		{
			System.out.println(num3+" is the largest number.");
		}
	}

	public static void main(String args[])
	{
		Largest obj = new Largest();
		
		obj.findLargest();
	}
}