package bloom;

import java.util.Scanner;

public class third {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int num1,num2,prime=0;
		System.out.println("Enter two numbers :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Prime numbers in between are :");
		for(int i = (num1+1); i < num2; i++)
		{	for(int j=2;j < i;j++ )
			{	if( (i % j) == 0 )
				{	prime++;
				}
			}
			if(prime == 0)
			{	System.out.print(i + " ");
			}
			prime = 0;
		}
	}

}