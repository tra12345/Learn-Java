	package basic;
	
	public class Main {
		public static void main(String[] args) {
			Person resutl = new Person(8);
			System.out.println(resutl.n);
			resutl.myTest1();
			
	//		Example Encapsulation
			resutl.setName("John", 10);
		    System.out.println(resutl.getName());
		    System.out.println(resutl.getAge());
		}
	}
