package basic;
import java.util.ArrayList;
import java.util.Collections;
public class ArraysList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example 1
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Vinfast");
	    cars.add("BMW");
	    cars.add("Honda");
	    cars.add("Mazda");
	    System.out.println(cars);
	    // Example 2
	    for (int i = 0; i < cars.size(); i++) {
	        System.out.println(cars.get(i));
	      }
	    // Example 3
	    for (String e : cars) {
	        System.out.println(e);
	      }
	    // Example 4
	    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(10);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(25);
	    for (int i : myNumbers) {
	      System.out.println(i);
	    }
	    // Example 5
	    ArrayList<Integer> myNumbers1 = new ArrayList<Integer>();
	    myNumbers1.add(125);
	    myNumbers1.add(10);
	    myNumbers1.add(20);
	    myNumbers1.add(35);
	    Collections.sort(myNumbers1);
	    for (int i : myNumbers1) {
	      System.out.println(i);
	    }
	}

}
