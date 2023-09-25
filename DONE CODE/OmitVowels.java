import java.util.Scanner;
class OmitVowels{
	public static void main(String [] args){
		
		String str1,str2;
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string : ");
        str1=sc.nextLine();

        str2=str1.replaceAll("[aeiouAEIOU]","");
		
        System.out.println("Original string is : "+str1);
        System.out.println("After omitting vowels string becomes  : "+str2);		
		
		
	}
}