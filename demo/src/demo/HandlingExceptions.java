package demo;

public class HandlingExceptions {
public static void main(String[] args) {
	int i=0;
	int y=10;
	int[] arr = {1,2,3};
	try {
		System.out.println(arr[4]);
		System.out.println(y/i);
	}catch(ArithmeticException e) {
	      //e.printStackTrace(); //red color
          System.out.println(e.getMessage());
		System.out.println("please avoid divide by 0");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("please provide the correct index for array");
	}finally {   //if catch block is not their also finally block code will be excuted but below code of finally will not be printed
		System.out.println("this is finally block");
	}
	System.out.println("Divide operation");
}
}
