import java.util.*;
class EvenNumber{
public static void main(String [] args ){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a num :" );
	int num=sc.nextInt();
	
	if(num%2==0)
	
		System.out.println("Even no");
	
	else
		System.out.println("Not even no");
		
}
}