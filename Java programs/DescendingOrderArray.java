//write a program for to print the given array in descending order....
class y {  
    public static void main(String[] args) {      
         
        //Initialize array   
        int [] arr = {5,6,2,9,8,4,1,3,7,10};   
       int min,temp=0; 
        for(int i = 0; i < arr.length; i++) { 

            min=i;		
            for(int j = i + 1; j < arr.length; j++) { // This loop travese whole array for every elements is matching Duplicates or not 
                if(arr[j] > arr[min]) 
				{
				   min=j;	
				}
			}
					
                 temp=arr[i];	
                 arr[i]=arr[min];
                 arr[min]=temp;  
								 
            }  
		for(int i = 0; i < arr.length; i++){ //Here all values are iterated....
		System.out.println(arr[i]);
		}
    }  
}