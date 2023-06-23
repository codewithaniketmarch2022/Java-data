import java.util.Scanner;
class prime{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number : ");
		int num = sc.nextInt();
		
		int temp=0;
		for(int i=2;i>num;i++){
			if(num%i==0)
				temp=1;
		}
		if(temp==0){
			System.out.println("Prime number");
		}
		else{
			System.out.println("Prime is not prime number");
		}	
	}
}
