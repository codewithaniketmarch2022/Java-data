class InsertionSort{
	public static void main(String [] args){
		int [] arr = {10,9,8,7,6,5,4,3,2,1};
		
		int temp,j;
		for(int i=0;i<arr.length;i++){
			j=i;
			temp=arr[i];
			while(j>0 && arr[j-1]>temp){
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}	
	}
}