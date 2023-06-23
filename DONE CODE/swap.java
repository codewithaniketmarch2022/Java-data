//     import java.util.Scanner;
    class swap{
	public static void main(String [] args){
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Value of a : "); 
		int a=sc.nextInt();
		
		System.out.println("Enter the Value of b : ");
		int b=sc.nextInt();*/
		
		int a=10;
		int b=20;
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swapping value of a = "+a);
		System.out.println("After swapping value of b = "+b);
			
	}
}