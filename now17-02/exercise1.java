package now;
import java.util.Scanner;
public class exercise1 {

	public static void main(String[] args) 
{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet : ");
		char alph = sc.next().charAt(0);
		if(alph >= 'a' && alph <= 'z' || alph >= 'A' && alph <= 'Z')
		{	if(alph =='a'||alph =='e'||alph =='i'||alph =='o'||alph =='u'||alph =='A'||alph =='E'||alph=='I'||alph =='O'||alph =='U')
			System.out.println("It is a vowel ");
			else
			System.out.println("It is a consonant ");
		}
		else
			System.out.println("It is not an alphabet ");
	}

}


