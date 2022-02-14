package third;

import java.util.Scanner; 

public class third {

	public static void main(String[] args) {
		/*int n;
		Scanner sc=new Scanner(System.in); 
		System.out.println("How many numbers are you entering?");
		n=sc.nextInt(); 
		for(int i=0; i<n; i++)  
		{ 	num[i]=sc.nextInt();  
		}
		int largest = num[0],smallest = num[0];
		for(int i=1;i<10;i++)
		{	
			if(num[i] > largest)
			{	largest = num[i];
			}
		}
		for(int i=1;i<10;i++)
		{	
			if(num[i] < smallest)
			{	smallest = num[i];
			}
		}
		System.out.println(largest + " - largest number");
		System.out.println(smallest + " - smallest number");
		*/
		
		arry();
	}
	
	public static void arry() 
	{
		int num[]= {1,8,4,6,3,7,9,5,0,2};
		int largest = num[0],smallest = num[0];
		for(int i=1;i<10;i++)
		{	
			if(num[i] > largest)
			{	largest = num[i];
			}
		}
		for(int i=1;i<10;i++)
		{	
			if(num[i] < smallest)
			{	smallest = num[i];
			}
		}
		System.out.println(largest + " - largest number");
		System.out.println(smallest + " - smallest number");

	}
}
