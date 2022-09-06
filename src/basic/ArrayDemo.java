package basic;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example 1
		int array[] = new int[10];
        for (int count = 0; count < 10; count++){
           array[count] = count+1;
       }
       for (int count = 0; count < 10; count++){
           System.out.println("array["+ count +"] = "+ array[count]);
       }
       // Example 2
       String[] b = {"Apple","Mango","Orange"};
       System.out.println("Before Function Call    "+ b[0]);
       ArrayDemo.passByReference(b);
       System.out.println("After Function Call    "+ b[0]);
       //Example 3
       int[][] twoD = new int[4][4];
       twoD[0][0] = 1;
       twoD[1][1] = 2;
       twoD[3][2] = 3;
       System.out.print(twoD[0][0] + " ");
      }
	public static void passByReference(String a[]){
	     a[0] = "Changed";
	   }

	}
