//Java program to demonstrate working of method 
// overloading in Java 
  
     class Overload { 
  
     int Overload(int x, int y) 
	 { 
	    return (x + y);
	 } 
  
    int Overload(int x, int y, int z) 
     { 
        return (x + y + z); 
     } 
  
    
    double Overload(double x, double y) 
     { 
        return (x + y); 
     } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        Overload s = new Overload(); 
        System.out.println(s.Overload(10, 20)); //30
        System.out.println(s.Overload(10, 20, 30)); //60
        System.out.println(s.Overload(10.5, 20.5)); //31.0
    } 
}