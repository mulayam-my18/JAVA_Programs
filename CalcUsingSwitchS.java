package learnM;

import java.util.Scanner;

public class CalcUsingSwitchS {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Caculator");
		
		System.out.println("Enter 1st no. ");
		double num1=sc.nextDouble();
	   // sc.nextLine();
		
		System.out.println("Enter 2nd no. ");
		double num2=sc.nextDouble();
	   // sc.nextLine();
		
		
		System.out.println("operation: "); 
	   // String cal=sc.nextLine(); ---->  with sc.nextLine instructor JVM will jump without scan it.
		String cal=sc.next();
		
		
		switch(cal) {
		
		case "add" : System.out.println(num1+num2);
		break;
		
		case "sub" : System.out.println(num1-num2);
		break;
		
		case "mul" : System.out.println(num1*num2);
		break;
		
		case "div" : System.out.println(num1/num2);
		break;
		
		default : System.out.println("Please give name in all small letters");
		
		}
		

	}

}
