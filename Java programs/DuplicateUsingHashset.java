import java.util.*;
class DuplicateUsingHashset{ //duplicates not allowed is property of set
	public static void main(String [] args){
		 int []a = {3,4,5,6,7,3,5};
		 
		 HashSet<Integer>obj=new<Integer>HashSet();
		 for(int i=0;i<a.length;i++){
			 
			 if(obj.add(a[i])==false){
		     System.out.println(a[i]+" is duplicate in the array");
			 }
		 }
	}
}
		
	