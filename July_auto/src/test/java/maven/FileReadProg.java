package maven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadProg {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\anwreddy\\Desktop\\july.txt");
	FileReader fr= new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	String s = br.readLine();
	while(s!=null) {
		System.out.println(s);
		s=br.readLine();	
	}
	
	/*System.out.println((char)fr.read());
	int i = fr.read();
	while(i!=-1) {
		System.out.print((char)i);
		i = fr.read();
	}*/
}
}
