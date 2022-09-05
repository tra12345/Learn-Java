	package basic;
	import java.util.Scanner;
	public class Main {
		public static void main(String[] args) {
			Person result = new Person(8);
			System.out.println(result.n);
			result.myTest1();
			
		    //Example Encapsulation
			result.setName("John", 10);
		    System.out.println(result.getName());
		    System.out.println(result.getAge());
		    
   		    // import the Scanner class 
		    Scanner myObj = new Scanner(System.in);
		    System.out.println("Please enter username");
		    String username = myObj.nextLine();
		    System.out.println("My name is " + username);
		    
		    //Example
		    //System.out.println(result.fname);
		    
		    // Example Inheritance
		    name result1 = new name();
		    result1.myClass();
		    System.out.println(result1.fname);
		    System.out.println(result1.modelName);
		    
		    // Example Inner Class Example
		    InnerClassExample myOuter = new InnerClassExample();
		    InnerClassExample.InnerClass myInnert = myOuter.new InnerClass();
		    System.out.println(myOuter.Text1 + myInnert.Text2);
		    
		    InnerClassExample.InnerClass1 myInnert1 = myOuter.new InnerClass1();
		    System.out.println(myInnert1.myInnerMethod());
		}
	}
