class ConstructorChaining{
	
	ConstructorChaining()
	{
		this(5);
		System.out.println("Hello CDAC");	
	}
	ConstructorChaining(int x)
	{
		this(5,20);
		System.out.println(x);		
	}
	ConstructorChaining(int x,int y)
	{
		System.out.println(x * y);	
	}
	
		
    public static void main(String [] args){
	 
	 ConstructorChaining obj = new ConstructorChaining();
	
	
    }

}