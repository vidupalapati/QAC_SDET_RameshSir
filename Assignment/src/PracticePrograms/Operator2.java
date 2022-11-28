// This program checks if a given number is a multiple of 3 and a even number
package PracticePrograms;

import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		
		if(num%3 == 0)
		{
			if(num%2==0)
			{
				System.out.println(num+" is a multiple of 3 and an even number");
			}
			else
			{
				System.out.println(num+" is a multiple of 3 and not an even number");
			}
		}
		else
		{
			System.out.println(num+" is not a multiple of 3");
		}
	}
}
