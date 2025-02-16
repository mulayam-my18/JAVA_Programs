package learnM;

import java.util.Scanner;

public class NoOfDigits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The No.: ");
		int n=sc.nextInt();                                             
		int count=0;
		
		for(;n>0; n=n/10) {
			
			count++;
		}
		
		System.out.println("The no. of digits: "+count);
	}

}
