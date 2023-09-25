class BubbleSort{
	public static void main(String [] args){
		int [] arr = {10,9,7,6,1,2,4,3,5,8};
		
		int temp;
	    for(int i=0;i<arr.length;i++){  //traverse array..
		for(int j=0;j<arr.length-1;j++){
			if(arr[j]>arr[j+1]){
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		}
		for(int i=0;i<arr.length;i++){
		System.out.print(" "+arr[i]);
		}
		
	}
}