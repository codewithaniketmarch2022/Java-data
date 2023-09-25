class selectionSort{
	public static void main(String [] args){
		int [] arr = {5,6,9,7,3,2,10,1};
		
		int min,temp=0;
		for(int i=0;i<arr.length;i++){  //traverse array..
			min=i;
			for(int j=i+1;j<arr.length;j++){  // comparison of array.....
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			temp=arr[i];     //swapping
			arr[i]=arr[min]; //swapping
			arr[min]=temp;    //swapping
		}
		for(int i=0;i<arr.length;i++){  //for printing output array...
			System.out.print(" "+arr[i]);
		}
	}
}