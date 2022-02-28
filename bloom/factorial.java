package bloom;

import java.util.Scanner;

public class second {

	public static void main(String[] args)	{
		Scanner n = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = n.nextInt();
		int fact;
/*		for(i=(num-1) ; i>1 ; i-- )
		{	fact = num*i;
			num = fact;
		}
		System.out.println("Factorial is " + num);
	}*/
		int i = (num-1);
		while( i>1)
		{	fact = num*i;
			num = fact;
			i--;
		}
		System.out.println("Factorial is " + num);
	}
}
