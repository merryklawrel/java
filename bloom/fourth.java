package bloom;

import java.util.Scanner;

public class fourth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = sc.next();
		String n = "";
		for(int i= (str.length() -1); i >= 0; i--)
		{	char m = str.charAt(i);
			n = n + m;
		}
		System.out.println(n);
	}
}


