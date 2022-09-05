package basic;

class InnerClassExample {
	int Mumber = 10;
	String Text1 = "Example"; 
	class InnerClass{
		String Text2 = "Inner Class Example";
	}
	class InnerClass1{
		public int myInnerMethod() {
			return Mumber;
		}
	}

}
