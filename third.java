package third;

import java.util.Scanner; 

public class third {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in); 
		System.out.print("How many numbers are you entering?");
		n = sc.nextInt(); 
		int num[] = new int[n];
		System.out.print("Enter the elements : ");
		for(int i=0; i<n; i++)  
		{ 	num[i] = sc.nextInt();  
		}
		int largest = num[0],smallest = num[0];
		for(int i=1;i<n;i++)
		{	
			if(num[i] > largest)
			{	largest = num[i];
			}
		}
		for(int i=1;i<n;i++)
		{	
			if(num[i] < smallest)
			{	smallest = num[i];
			}
		}
		System.out.println(largest + " - largest number");
		System.out.println(smallest + " - smallest number");		
	}
	
}
