//Finding Minimum Element of Java ArrayList
import java.util.ArrayList;
import java.util.Collections;
  
class MinElementInArrayList {
  
    public static void main(String[] args)
    {
        ArrayList<Integer> myList  = new ArrayList<Integer>();
          
        // adding elements to Java ArrayList
        myList.add(16);
        myList.add(26);
        myList.add(3);
        myList.add(52);
        myList.add(70);
        myList.add(12);
		System.out.println(myList);
  
        int minimum = myList.get(0);
        for (int i = 1; i < myList.size(); i++) {
            if (minimum > myList.get(i))
                minimum = myList.get(i);
        }
        System.out.println("Minimum element in ArrayList = "
                           + minimum);
    }
}