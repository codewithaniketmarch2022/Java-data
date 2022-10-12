//write a program for to get 2nd largest element in array..
//write a program for to get largest element in array..
//write a program for to get 3rd largest element in array..
class SecondLargestElement {  
    public static void main(String[] args) {      
         
        //Initialize array   
        int [] arr = {1, 2, 3, 4, 9, 2, 7, 8, 3, 10};   
        int temp;  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) { // This loop travese whole array for every elements is matching Duplicates or not 
                if(arr[i] < arr[j]){  
					
                 temp=arr[i];	
                 arr[i]=arr[j];
                 arr[j]=temp;   //after swapping output get in descending order...
				}				 
            }  
        } 
		System.out.println("largest Element in array is "+arr[0]);
		System.out.println("Second largest Element in array is "+arr[1]);
		System.out.println("Third largest Element in array is "+arr[2]);
		
		
    }  
}  