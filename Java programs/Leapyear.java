//Write a program to find the given YEAR is LEAP-YEAR or not?
import java.util.*;	
public class Leapyear		
{	
	 public	static void	main(String[] args)	
	 {	
	 	 Scanner sc = new Scanner(System.in);	
	 	 System.out.println("Enter the year :")	;	
	 	 int m = sc.nextInt();	
	 	 if(m%4==0&&m%100!=0||m%400==0)	
	 	 	 System.out.println	("it is a leap year");	
	 	 else	
	 	 	 System.out.println("not a leap year");	
	 }	
}