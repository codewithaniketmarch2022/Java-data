import java.util.Scanner;
class swappingWithoutUsingThirdVariable{
	public static void main(String [] args){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a=sc.nextInt();
		
		System.out.println("Enter the value of b : ");
		int b=sc.nextInt();
		
		System.out.println("The value before swapping : "+a+" "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The value after swapping is : "+a+" "+b);
	}
}