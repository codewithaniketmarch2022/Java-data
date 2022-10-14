class Fabunicaii {   // It means that next term is the addition of previous 2 numbers..... 
  public static void main(String[] args) {
	  
	  int a = 0, b = 1;
	  System.out.print(a+" "+b);  // It prits here only initial values
	  
	  int c;
	  for(int i = 1;i <= 10;i++){  //value printing upto 10...
		  
		  c = a + b;
		  System.out.print(" "+c); // print here next term i.e c... 
		  a = b;
		  b = c;
	  } 
   }
}