package basic;

public class Person {
	private String name;
	private int age;

	   // Getter
	   public String getName() {
	     return name;
	   }
	   public int getAge() {
		   return age;
	   }

	   // Setter
	   public void setName(String newName, int age) {
	     this.name = newName;
	     this.age = age;
	   }
}
