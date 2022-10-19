//write the java program for find the Missing no in a given array.....

class FindMissingNumber{                          //Missing no = addition of all elements in array(including also missing elements)-addition of present elements in array;
     public static void main(String [] args){
		 int [] arr = {1,2,3,4,5,6,7,8,10};
		 
		 int expected_no_Elements = arr.length+1;
		 int total_sum = expected_no_Elements*(expected_no_Elements+1)/2;
		 System.out.println(total_sum);
		 
		 int sum = 0;
		 for(int i = 0;i < arr.length;i++ ){
			 sum = sum + arr[i]; 
		 }
		  System.out.println("Missing No in Given array is "+(total_sum - sum));
	 }
}
	

