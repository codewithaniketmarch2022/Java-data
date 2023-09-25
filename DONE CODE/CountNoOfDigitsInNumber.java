import java.util.Scanner;
class CountNoOfDigitsInNumber{
	public static void main(String [] args){
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num : ");
		int num = sc.nextInt();
		//int num=421563;
		
		while(num!=0){
		num/=10;
		++count;
		}
		System.out.println(count);
		
	}
}