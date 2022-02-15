package third;

import java.util.Scanner;

public class program4 
{
	public static void main(String[] args) 
		{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String a = in.nextLine();
		System.out.print("Enter next string: ");
		String b = in.nextLine();
		if(a.endsWith(b))
		  {	System.out.println("First string ends with the second.");
		  }
		else
		  {	System.out.println("First string doesnt end with the second string.");
		  }
		}
}
