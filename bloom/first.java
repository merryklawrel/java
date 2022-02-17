package bloom;

import java.util.Scanner;

public class first {

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet : ");
		char alph = sc.next().charAt(0);
//		if(alph >= 'a' && alph <= 'z' || alph >= 'A' && alph <= 'Z')
//		{	if(alph =='a'||alph =='e'||alph =='i'||alph =='o'||alph =='u'||alph =='A'||alph =='E'||alph=='I'||alph =='O'||alph =='U')
//			System.out.println("It is a vowel ");
//			else
//			System.out.println("It is a consonant ");
//		}
//		else
//			System.out.println("Error! It is not an alphabet ");
		if(alph >= 'a' && alph <= 'z' || alph >= 'A' && alph <= 'Z')
		{	switch(alph) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':	
				{	System.out.println("It is a vowel ");
					break;
				}
			default:
				System.out.println("It is a consonant ");
		}
		}
		else
			System.out.println("It is not an alphabet ");
	}


	}

