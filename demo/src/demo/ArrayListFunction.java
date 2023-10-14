package demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ArrayList<String> al = new ArrayList<String>();
           al.add("anwesh");
           al.add("reddy");
           al.add("charan");
           al.add(1,"dileep");
           al.add(2,"bharath");
           al.add("anwesh");
           System.out.println(al);
           System.out.println(al.get(3));
           for(String s:al)
        	   System.out.println(s);
           //al.clear();
           System.out.println(al);
           System.out.println(al.contains("anwesh"));
           System.out.println(al.indexOf("reddy"));
           al.remove(0);
           System.out.println(al);
           al.set(0,"ganesh");
           System.out.println(al);
           Collections.sort(al);
           System.out.println(al);
           Collections.sort(al,Collections.reverseOrder());
           System.out.println(al);
           
           
           
	}

}
