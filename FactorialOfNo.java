package learnM;

import java.util.Scanner;

public class FactorialOfNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the No.: ");
		
		int n=sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			
			fact=fact*i;
			
		}
		
		System.out.println("The Factroil of "+n+" Is: "+fact);
		

	}

}