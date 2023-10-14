package maven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class Assignment10 {
	StringBuffer st= new StringBuffer();
@Test
public void readAndWrite() throws IOException {
	FileReader fr = new FileReader("C:\\Users\\anwreddy\\Desktop\\Read.txt");
	FileWriter fw = new FileWriter("C:\\Users\\anwreddy\\Desktop\\Write.txt");
	BufferedReader br = new BufferedReader(fr);
	BufferedWriter bw = new BufferedWriter(fw);
	String s = br.readLine();
	while(s!=null) {
		if(!s.contains("error")) { 
			st.append(s+"\n");
		}	
	s=br.readLine();
	}
	bw.write(st.toString());
bw.flush();
bw.close();
	}
@Test
public void Upper() throws IOException {
	FileReader fr = new FileReader("C:\\Users\\anwreddy\\Desktop\\Read.txt");
	FileWriter fw = new FileWriter("C:\\Users\\anwreddy\\Desktop\\Write.txt");
	BufferedReader br = new BufferedReader(fr);
	BufferedWriter bw = new BufferedWriter(fw);
	String s = br.readLine();
while(s!=null) {
		st.append(s+"\n");
s=br.readLine();}
bw.write(st.toString().toUpperCase());
bw.flush();
bw.close();
}

}