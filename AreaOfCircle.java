package learnM;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		double pi=3.142;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Radius Of Circle: ");
		int radius=sc.nextInt();
		
		System.out.println("The Area Of Circle: "+pi*radius*radius);

	}

}
