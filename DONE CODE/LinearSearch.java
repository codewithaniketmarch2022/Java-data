class LinearSearch{    
        static int linearSearch(int[] arr, int key){  //static method is created because there is a no need to  create object in main......   
        for(int i=0;i<arr.length;i++){                // int is returnt type of method because it returns int value at the end hence it is given...
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String [] args){    
        int[] a1= {10,20,30,50,70,90};    
        int key = 50;    
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
    }    
} 