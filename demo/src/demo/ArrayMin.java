package demo;

public class ArrayMin {
	static int r,c;
	public static void main(String[] args) {
		int[][] arr = {{5,20,7},{2,1,13},{17,4,8}};
		System.out.println("The minimum number of array is "+min(arr)[1]);
		int i = min(arr)[0];
		int max =  min(arr)[1];
			for(int j=0;j<arr[0].length;j++) {
				if(max < arr[j][i])
					max=arr[j][i];
			}
			System.out.println("The maximum number of minimum number coloumn is: "+max);
			}
	
	
	public static int[] min(int[][] arr) {
		int min = arr[0][0];
		for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			if(min>arr[i][j]) {
				r=i;c=j;
				min = arr[i][j];}
		}
		}
		int[] a = {c,min};
		return a;}
	}
