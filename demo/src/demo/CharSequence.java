package demo;

public class CharSequence {
  public static void main(String[] args) {
	char[] ch = {'s','e','l','i','n','i','u','m','w','i','t','h','j','a','v','a'};
	int[] freq = new int[ch.length];
/*public class Frequency   
{  
     public static void main(String[] args) {  
        String str = "picture perfect";  
        int[] freq = new int[str.length()];  
        int i, j;  
          
        //Converts given string into character array  
        char string[] = str.toCharArray();  
  */        
        for(int i = 0; i <ch.length; i++) {  
            freq[i] = 1;  
            for(int j = i+1; j <ch.length; j++) {  
                if(ch[i] == ch[j]) {  
                    freq[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    ch[j] = '0';  
                }  
            }  
        }  
          
        //Displays the each character and their corresponding frequency  
        System.out.println("Characters and their corresponding frequencies");  
        for(int i = 0; i <freq.length; i++) {  
            if(ch[i] != ' ' && ch[i] != '0')  
            	if(freq[i]>1) {
                System.out.println(ch[i] + "-" + freq[i]);  
        }  }
    }  
}