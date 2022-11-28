package PracticePrograms;

import java.util.Scanner;

public class multiplesOfThree {
	
	static void isMultipleOfThree(int a)
	{
		if(a%3 == 0)
		{
			System.out.println(a+" is a multiple of 3");	
		}
		else
		{
			System.out.println(a+" is not amultiple of 3");	
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter any number to verify if it is a multiple of 3 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		isMultipleOfThree(num);
	}
}
