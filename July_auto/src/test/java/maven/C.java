package maven;

import java.io.IOException;
import java.util.ArrayList;

public class C {
	public static void main(String[] args) throws IOException {
		ReadExceldata rd = new ReadExceldata();
		//ReadDataFromExcel rd = new ReadDataFromExcel();
		ArrayList<String>  s = rd.getData("testDropDown3");
	System.out.println(s);
	}

}
