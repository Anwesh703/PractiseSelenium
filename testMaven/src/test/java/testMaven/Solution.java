package testMaven;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
 public static int calculateDiscount(int billAmount) {
	 int answer = 0;
	 String temp = Integer.toString(billAmount);
	 int[] num = new int[temp.length()];
	 
	 for(int i=0;i<temp.length();i++) {
		 num[i] = temp.charAt(i)-'0';    
		 if(num[i]%2!=0) {
			 answer += num[i];
		 }
	 }
	 
	 return answer;
 }
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int billAmount = in.nextInt();
	int result = calculateDiscount(billAmount);
	System.out.println(result);
}
}
