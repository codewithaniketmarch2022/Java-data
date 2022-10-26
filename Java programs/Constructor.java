class Constructor{
	
	   Constructor(int a,int b){ // constructor
		int z;
		z=a+b;
		System.out.println(z);
        		
	  }
	  public static void main(String [] args){
		Constructor obj = new Constructor(10,15);//object is created...
	  }
}	

//constructors are useful for to initialize the objects, when object is created in main class 
//at that time constructor is loaded in the memory......
//constructor name and class name shoud be same,constructor dosent 
//having any return type....
//