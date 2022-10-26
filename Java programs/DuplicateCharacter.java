//write a program for find a no of duplicate character in array....
class DuplicateCharacter {  
    public static void main(String[] args) {      
          
        //Initialize array   
        String [] arr = {"a","b","c","d","a","f","c","b"};   
          
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