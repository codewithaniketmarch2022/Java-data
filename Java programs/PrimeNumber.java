//Write the java program for Prime Number..........
import java.util.Scanner;
class PrimeNumber{
	
     public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a num : ");
		 int num = sc.nextInt();
		 
		 int temp = 0;
		 for(int i=2;i<num;i++){
			 if(num % i == 0 )
		     temp=1;
		 }
		     if(temp == 0){
	         System.out.println("Given number is a prime : ");
	     }
         else{
             System.out.println("Given number is a not prime : ");
		 }
		 
	 }
}
