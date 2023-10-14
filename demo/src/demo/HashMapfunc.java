package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapfunc {
public static void main(String[] args) {
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
    hm.put(100, "Anwesh");
    hm.put(101, "charan");
    hm.put(900, "dileep");
    hm.put(00, "c");
    System.out.println(hm);
    
    System.out.println(hm.get(900));
    hm.remove(0);
    hm.remove(900,"Priyankas");
    hm.replace(101,"reddy");
    System.out.println(hm);
    Iterator it = hm.entrySet().iterator();
    while(it.hasNext()) {
    	//feching values based on each in hash map
    	//int key =(int) it.next();
    	//System.out.println(hm.get(key));
    	//to fect both key and value in different map object
    	Map.Entry map = (Map.Entry)it.next();
    	System.out.println(map.getKey());
    	System.out.println(map.getValue());
    	
    	
    }
}
}
