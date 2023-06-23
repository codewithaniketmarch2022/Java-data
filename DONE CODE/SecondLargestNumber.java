class SecondLargestNumber{
	public static void main(String [] args){
	       int[]arr={1,5,8,9,15,45,88,99,105,888};	
		   int temp;
		   
		   for(int i=0;i<arr.length;i++){
			   for(int j=i+1;j<arr.length;j++){
				   if(arr[i]<arr[j]){
					   
					   temp=arr[i];
					   arr[i]=arr[j];
				       arr[j]=temp;
		   }
		}
	}
	    System.out.println("The 1st largest number is "+arr[0]);
		System.out.println("The 1st largest number is "+arr[1]);
		System.out.println("The 1st largest number is "+arr[2]);
    }
}