//Write a program to find the FACTORIAL of a given number?		
import java.util.*;	
class Factorial		
{	
	 public	static void	main(String[] args)		
	 {	
	 	 Scanner sc = new Scanner(System.in);	
	 	 System.out.println("Enter the number: ");	
	 	 int n = sc.nextInt();	
	 	 int fact=1;	
	 	 for (int i=1;i<=n;i++)	
	 	 {	
	 	 	 fact=fact*i;	
	 	 }	
	 	 System.out.println("The Factorial of Given number is: "+fact);	
	 }	
}