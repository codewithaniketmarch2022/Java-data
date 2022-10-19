// Overriding of methods...

class Human{  //Parent class
   
   public void eat()  //Overridden method
   {
      System.out.println("Human is eating");
   }
}

class Overriding extends Human{  //child class
   
   public void eat()   //Overriding method
   {  
      System.out.println("Boy is eating");
   }
   public static void main( String args[]) 
   {
      Overriding obj = new Overriding();
      
      obj.eat();  //This will call the child class version of eat()
   }
}