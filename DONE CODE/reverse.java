class reverse{
	public static void main(String [] args){
		String str="aniket";
		String reversedStr="";
		
		for(int i=str.length()-1;i>=0;i--){
			reversedStr=reversedStr+str.charAt(i);
		}
		System.out.println("Original string is "+str);
		
		System.out.println("reversed string is "+reversedStr);
		
	}
}