package testMaven;

import java.util.Scanner;

public class Solution1 {
	public static int[] maxRevenue(int[][] salesRecord) {
		int[] answer = new int[3];
		for(int i = 0;i<salesRecord.length;i++) {
			int largest = salesRecord[i][0];
			for(int j=0;j<salesRecord[i].length;j++) {
				if(largest < salesRecord[i][j] ) {
					largest = salesRecord[i][j];
				    answer[i]=largest;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int salesRecord_row = in.nextInt();
	int salesRecord_col = in.nextInt();
	int salesRecord[][] = new int[salesRecord_row][salesRecord_col];
	for(int idx = 0;idx<salesRecord_row;idx++) {
		for(int jdx = 0;jdx<salesRecord_col;jdx++){
			salesRecord[idx][jdx]=in.nextInt();
		}
	}
	int[] result = maxRevenue(salesRecord);
	for(int idx = 0;idx<result.length-1;idx++) {
		System.out.print(result[idx]+" ");
}
	System.out.println(result[result.length-1]);
}
}
