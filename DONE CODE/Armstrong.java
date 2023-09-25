import java.util.Scanner;
class Armstrong{
	public static void main(String [] args){
		
		int n,sum=0,num,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number : ");
	    n = sc.nextInt();
		
		num=n;
		while(num>0){
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}
		if(n==sum){
			System.out.println("Given no is armstrong number");
		}
		else{
			System.out.println("Given no is not an armstrong number");
		}
	}
}
			