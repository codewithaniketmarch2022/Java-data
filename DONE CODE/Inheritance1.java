class Mumbai{    //super class or parent class....
     void dispaly(){
	 System.out.println("Mumbai is capital of Maharashtra...");
	 }
	 }
	 class pune extends Mumbai{  //subclass or childclass..
	 void show(){
	 System.out.println("pune is Good place in Maharashtra...");
	 }
	 }
	 class Inheritance1{
		 public static void main(String [] args){
         pune obj = new pune();
		 obj.dispaly();

		 }
	 }		 