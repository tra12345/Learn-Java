package basic;

public class MyClass {

	public static void main(String[] args) {
		Person myObj = new Person();
	    myObj.setName("John", 10);
	    System.out.println(myObj.getName());
	    System.out.println(myObj.getAge());
	}

}
