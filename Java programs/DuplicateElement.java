//write a program for find a no of duplicate elements in array....
class DuplicateElement {  
    public static void main(String[] args) {      
          
        //Initialize array   
        int [] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};   
          
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) { // This loop travese whole array for every elements is matching Duplicates or not 
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  