package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
 public static String getDataFromProperty(String key) throws IOException {
	Properties prop = new Properties();
	 File f = new File("C:\\Users\\anwreddy\\eclipse-workspace\\July_auto\\src\\test\\resources\\config.properties");
	 FileReader fr = new FileReader(f);
	 prop.load(fr);
	 
	 return prop.getProperty(key);
 }
}
