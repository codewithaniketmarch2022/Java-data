import java.util.*;
class ArrayListString{
	public static void main(String [] args){
		
		ArrayList<String> obj = new ArrayList<String>(); //Generics syntax
	
		obj.add("A");
		obj.add("Aniket");
		obj.add("Shravya");
		obj.add("Sharvil");

		System.out.println(obj);
		
		obj.remove(2);
		System.out.println(obj);
		
	}
}