class ConstructorOverloading {  
 
int id;  
String name;  
  
ConstructorOverloading(){  
System.out.println("this a default constructor");  
}  
  
ConstructorOverloading(int i, String n){  
id = i;  
name = n;  
}  
  
public static void main(String[] args) {  

ConstructorOverloading s = new ConstructorOverloading();  
System.out.println("\nDefault Constructor values: \n");  
System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);  
  
System.out.println("\nParameterized Constructor values: \n");  
ConstructorOverloading student = new ConstructorOverloading(10, "David");  
System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);  
}  
}