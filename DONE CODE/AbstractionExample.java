//abstract class
abstract class Car{  
    abstract void accelerate();  //abstract method having no method body
}                                // not possible to create object of abstract class..but we can create it by using its reference..
//concrete class
class Suzuki extends Car{  
    void accelerate(){
        System.out.println("Suzuki::accelerate");
     
    }
}
class AbstractionExample{
    public static void main(String args[]){  
        Car obj = new Suzuki();    //Car object =>contents of Suzuki
        obj.accelerate();          //call the method  
    }   
}  