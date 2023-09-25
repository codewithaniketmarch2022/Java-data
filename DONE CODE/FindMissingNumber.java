class FindMissingNumber{
	public static void main(String [] args){
		
		int [] arr = {1,2,4,5,6,7,8,9,10};
		
		int MissingNo = arr.length+1;
		int total_sum = MissingNo*(MissingNo+1)/2;
		System.out.println(total_sum);
		
		int sum = 0;
		for(int i = 0;i<arr.length;i++){
			sum = sum + arr[i];
		}
		
		System.out.println("Missing nuber is "+(total_sum-sum));
	}
}