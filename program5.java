package third;

import java.util.Scanner;

public class program5 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String a = in.nextLine();
		String replace = a.replace("fox", "cat");
		System.out.println(replace);
	}

}
