	package basic;
	//Example Encapsulation
	public class Person {
		int n;
		public Person(int nn) {
			n = nn;
		}
		public void myTest1() {
			int x = 5;
			int y = 7;
			System.out.println(x + y);
		}
	
		static void myTest2() {
			System.out.println("Hello word");
		}
	
	//	Example Encapsulation
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
