import java.util.Scanner;
class Palindrome{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number : ");
	    String num = sc.nextLine();
		
		String reverse="";
		int length=num.length();
		
		for(int i=length-1;i>=0;i--){
			reverse=reverse+num.charAt(i);
		}
		if(num.equals(reverse)){
			System.out.println("Given no is Armstrong number");
		}
		else{
			System.out.println("Given no is not Armstrong number");
		}
	}
}
			