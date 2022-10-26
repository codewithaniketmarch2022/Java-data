import java.util.*;
class HashMapDemo{
	public static void main(String [] args){
		
		HashMap<String, Integer> obj = new HashMap<String, Integer>(); //Generics syntax
		obj.put("shravya",10); //shravya is key & 10 is value
		obj.put("sharvil",20); //put() is used for insertion ...
		obj.put("poonam",80);
		obj.put("Advait",30);
		
		System.out.println(obj);
		
		obj.put("Advait",50);
		System.out.println(obj);
		
		
		System.out.println(obj.get("poonam")); //for fetching get() is used...
		
		
	}
}