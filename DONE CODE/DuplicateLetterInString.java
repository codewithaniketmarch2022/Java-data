class DuplicateLetterInString{
	public static void main(String [] args){
		String str="peacock";
		int count=0;
		char [] arr=str.toCharArray();  //string is convert into char array.....
		
		System.out.println("String is : "+str);
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(arr[i]==arr[j]){
					System.out.print(" "+arr[j]);
					count++;
					break;
				}
			}
		}
		
	}
}