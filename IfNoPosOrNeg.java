package learnM;

import java.util.Scanner;

public class IfNoPosOrNeg {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the No.: ");
		int num=sc.nextInt();
		
		
		if(num<0) {
			
			System.out.println("The Number Neg.");
		}
		
		else if(num>0){
			
			System.out.println("The Number Pos.");
		}
		
		else {
			
			System.out.println("The Number Neutral.");
		}

	}

}
