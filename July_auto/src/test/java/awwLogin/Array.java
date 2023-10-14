package awwLogin;

public class Array {
public static int funCount(String datStream)//int data, int digit)

{
int answer=0;
String rev="";
char[] ch = datStream.toCharArray();
for(int i=ch.length-1;i>=0;i--) {
 rev = rev+ch[i];	
}
char[] ch2 = rev.toCharArray();
for(int i=0;i<ch.length;i++) {
	if(ch[i] == ch2[i])
		answer++;
}
//ekkadi nunchi rayyi

//String temp=Integer.toString(data);
//int[] m = new int[temp.length()];
//for(int i=0;i<temp.length();i++) {
//	m[i]=temp.charAt(i) - '0';
//}
//
//for(int i=0;i<m.length;i++) 
//	if(digit == m[i])
//		answer++;
	return answer;

//ekkada end cheye
}
public static void main(String args[])
{
//	int a=123334321;
//	int b=3;
	String a="sserewe";
System.out.println(funCount(a));
}
}
