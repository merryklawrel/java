package third;

import java.util.Scanner;

public class program1
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 numbers : ");
		float num1 = in.nextFloat();
		float num2 = in.nextFloat();
		in.close();
			if(Math.abs(Math.ceil(num1 - num2)) < 0.01)
			{  System.out.print("The numbers are same upto 2 decimal places. ");
			}
			else
				System.out.print("The numbers are not same upto 2 decimal places. ");
		}

	}
		


