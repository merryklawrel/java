package now;
import java.util.Scanner;
public class exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = sc.next();
		String n = "";
		for(int i= (sc.length() -1); i >= 0; i--)
		{	char m = sc.charAt(i);
			n = n + m;
		}
		System.out.println(n);
	}

}
