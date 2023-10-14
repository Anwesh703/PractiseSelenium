package demo;

public class CharFreq {
public static void main(String[] args) {
	String str = "hello anwesh hello";
	char[] ch = str.toCharArray();
	int[] freq = new int[ch.length];
	for(int j=0;j<ch.length;j++) {
	    for(int i=j+1;i<ch.length;i++) {
	         if(ch[j]==ch[i]) {
		         freq[j]++;
		         ch[i]='0';
	             } }}
	for(int i = 0; i <freq.length; i++) {  
        if(ch[i] != ' ' && ch[i] != '0')  
        	if(freq[i]>0) 
                System.out.println(ch[i] + "-" + ++freq[i]);  
    
}}}
