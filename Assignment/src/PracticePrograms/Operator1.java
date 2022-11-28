//This Program checks whether the given number is greater than 0 
//and less than 10
package PracticePrograms;

import java.util.Scanner;

public class Operator1 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = scan.nextInt();
		
		if(num >0 && num<10)
		{
			System.out.println(num+" is geater than 0 and less than 10 ");
			
		}
		else
		{
			System.out.println(num+" is not geater than 0 and less than 10 ");
		}
	}

}
