import java.util.*;
class Palindrome 
{  
    public static void main(String[] args)    
    {  
       //Take input from the user
       //Create instance of the Scanner class
	   
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the number: ");   
       String num = sc.nextLine(); //wrapper class
	   
	   String reverse = "";
	   
       int length = num.length();  //length of given number is stored in length variable....
	  
       for ( int i = length - 1; i >= 0; i-- )  {
	   reverse = reverse + num.charAt(i); 
	   }
       if (num.equals(reverse)) { 
         System.out.println("The entered string " +num +" is a palindrome");
	   }
       else  {
         System.out.println("The entered string " +num +"  isn't a palindrome");
	   }		 
    }
 } 