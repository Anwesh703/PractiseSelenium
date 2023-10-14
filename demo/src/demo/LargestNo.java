package demo;

import java.util.Scanner;

public class LargestNo {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int[] arr = {23,11,45,55,32};
	    int max = arr[0];
	    for(int i=0;i<arr.length-1;i++) {
		     if(arr[i]<arr[i+1]) {
			       max = arr[i+1];
		           }
	          }
	System.out.println(max);
	}
}
