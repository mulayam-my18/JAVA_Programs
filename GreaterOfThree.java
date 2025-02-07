package learnM;

import java.util.Scanner;

public class GreaterOfThree {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st No.: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter the 2nd No.: ");
		int num2=sc.nextInt();
		
		System.out.println("Enter the 3rd No.: ");
		int num3=sc.nextInt();
		
		if(num1>num2) {
			
			if(num1>num3) {
				System.out.println(num1+" is the greatest of given 3 no.");
				
			}
			else {
				System.out.println(num3+" is the greatest of given 3 no.");
			}
		}
		
		else {
			if(num2>num3) {
				System.out.println(num2+" is the greatest of given 3 no.");
				
			}
			else {
				System.out.println(num3+" is the greatest of given 3 no.");
			}
		}
		
		/*
		 * if(num1>num2 && num1>num3) {
		 * 
		 * }
		 */
		
		
		
	}

}
