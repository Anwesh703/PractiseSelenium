package maven;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.common.io.FileWriteMode;

public class WriteDataFile {
	public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\anwreddy\\Desktop\\july.txt");
	FileWriter fw = new FileWriter(f,true);
	BufferedWriter bw = new BufferedWriter(fw);
	bw.newLine();
	bw.write("Hello anwesh");
	bw.flush();
	bw.close();
	
	
	
	
	/*fw.write("\n This is new line2");
	fw.flush();
	fw.close();
	*/
	}
}
