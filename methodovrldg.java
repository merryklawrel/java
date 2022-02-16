package third;

import java.util.Scanner;

public class assignment6 {
		static void area(double side)
		{
			double area = (side*side);
			System.out.print("Area of the square : " + area + " units.");
		}
		static void area(double length, double breadth)
		{
			double area = (length*breadth);
			System.out.print("Area of the reactangle : " + area + " units.");
		}
		static void area(float radius)
		{
			double area = (3.14*radius*radius);
			System.out.print("Area of the circle : " + area + " units.");
		}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int op;
		System.out.print("To find the area of : \n 1.Square \n 2.Rectangle \n 3.Square \n\n Enter an option: 1,2 or 3 :");
		op = in.nextInt();
		if(op==1)
		{	System.out.print("Enter the side of the square : ");
			Double side = in.nextDouble();
			area(side);
		}
		else if(op==2)
		{	System.out.print("Enter the legth of the rectangle : ");
			Double length = in.nextDouble();
			System.out.print("Enter the breadth of the rectangle : ");
			double breadth = in.nextDouble();
			area(length,breadth);
		}
		else if(op==3)
		{	System.out.print("Enter the radius of the circle : ");
			float radius = in.nextFloat();
			area(radius);
		}
		else
			System.out.print("Invalid Option");
	}
}
