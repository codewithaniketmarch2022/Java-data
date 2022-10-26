import java.util.*;
class ArrayListDemo{
	public static void main(String [] args){
		
		ArrayList<Integer> obj = new ArrayList<Integer>(); //Generics syntax
		obj.add(10);
		obj.add(20);
		obj.add(null);
		obj.add(50);

		System.out.println(obj);
		
		obj.remove(3);
		System.out.println(obj);
		
	}
}