//write the code for count the no of letters in given string...
class CountNoOfLetters{
	public static void main(String [] args){
		String str = "aniket";
		int count=0;
		
		System.out.println("string is : "+str);
		for(int i=0;i<str.length();i++){
			if(Character.isLetter(str.charAt(i)))
				count++;
		}
		System.out.println("Total no of letters present in string are : "+count);
	}
}