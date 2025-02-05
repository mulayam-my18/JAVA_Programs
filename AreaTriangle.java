package learnM;

import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of triangle: ");
		double l=sc.nextDouble();
		
		System.out.println("Enter the breath of triangle: ");
		double b=sc.nextDouble();
		
		System.out.println("The Area of triangle: "+0.5*l*b);
		
		// double formula=0.5*l*b;
		// System.out.println("The Area of triangle: "+formula);

	}

}
