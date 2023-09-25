import java.util.Scanner;
class Factorial{
	public static void main(String [] args){
	
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a num : ");
    int num=sc.nextInt();

    int fact=1;//variable declaration and initialization...
    for(int i=1;i<=num;i++){ // if we take i=0 then condition becomes satisfied but we got value of fact is 0 as everytime hence value start from 1
        fact=fact*i; 
	}
    System.out.println("The factorial of given no is : "+fact);	
		
	}
}