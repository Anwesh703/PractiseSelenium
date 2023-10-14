package demo;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    HashSet<String> hs = new HashSet<String>();
        hs.add("anwesh");
        hs.add("jayanth");
        hs.add("c");
        hs.add("anwesh");    //dulplicate values cannot be inserted and sets are unordered
        
        System.out.println(hs);
        Iterator<String> it= hs.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        	// System.out.println(it.next()); //throws NoSuchElementException
        }
        for(String s:hs) {
        	System.out.println(s);
        }
	}

}
