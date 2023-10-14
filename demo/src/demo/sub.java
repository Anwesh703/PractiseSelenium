package demo;

public class sub {
public static void main(String[] args) {
	String str="This is my Session for automation and we will discuss automation of selenium automation";
	String str1="automation";
	if(str1.length()>str.length()) {
		System.out.println("Invalid ");
	}else {
	String[] sub=str.split(" ");
	int count=0;
	for(int i=0;i<sub.length;i++) {
	if(sub[i].contains(str1)) {
		count++;
	}}
System.out.println(str1+" Present "+count + " times in given string "+"("+str+")");
}}
}
