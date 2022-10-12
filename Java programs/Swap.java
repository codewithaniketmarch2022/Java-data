//Write a program to Swap two numbers without using 3rd variable?
import java.util.Scanner;
class Swap		
{	
	 public	static void main(String[] args){	
	 	 Scanner sc = new Scanner(System.in);	
	 	 System.out.println("Enter the Number1: ");
		 int num1=sc.nextInt();
		 System.out.println("Enter the Number2: ");
		 int num2=sc.nextInt();


	 	 num1=num1+num2;
		 num2=num1-num2;
	 	 num1=num1-num2;
	 		
	 	 System.out.println("After swapping num1 = "+num1);	
	 	 System.out.println("After swapping num2 = "+num2);	
	 }	
}