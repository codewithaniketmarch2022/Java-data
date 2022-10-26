// Finding Maximum Element of Java ArrayList
import java.util.ArrayList;
import java.util.Collections;
 
class MaxElementInArrayList {
 
    public static void main(String[] args)
    {
        // ArrayList of Numbers
        ArrayList<Integer> myList
            = new ArrayList<Integer>();
 
        // adding elements to Java ArrayList
        myList.add(16);
        myList.add(26);
        myList.add(3);
        myList.add(52);
        myList.add(70);
        myList.add(12);
 
        int maximum = myList.get(0);
        for (int i = 1; i < myList.size(); i++) {
            if (maximum < myList.get(i))
                maximum = myList.get(i);
        }
        System.out.println("Maximum Element in ArrayList = "
                           + maximum);
    }
}