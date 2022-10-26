import java.io.*;
import java.util.*;
class HashtableDemo { 
    public static void main(String args[]) 
    { 
        Hashtable<Integer, String> obj  = new Hashtable<Integer, String>(); 
  
        obj.put(4, "four");  //put() is used for insertion...
        obj.put(5, "five"); 
        obj.put(6, "six"); 
  
        System.out.println(obj); 
		
		obj.put(9, "Nine"); 
		System.out.println(obj);
    } 
}