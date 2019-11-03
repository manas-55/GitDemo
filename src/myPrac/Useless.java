package myPrac;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Useless {

	public static void main(String[] args) {
		
		
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("Name", "Manas");
		map.put("Class", "5");
		map.put("Roll", "21");
		map.put("School", "KV");
		map.put("Rank", "1");
		System.out.println(map);
		
		System.out.println("---------------------------------------");
		
		Hashtable<String,String> table = new Hashtable<String,String>();
		table.put("Name", "Manas");
		table.put("Class", "5");
		table.put("Roll", "21");
		table.put("School", "KV");
		table.put("Rank", "1");
		System.out.println(table);
		
		 TreeMap<String,String>  obj1= new TreeMap<String,String>();
		 obj1.put("B se" , "dekh");   
		 obj1.put("Alive is" , "Awesome");
		 obj1.put("C se" , "dekho");   
	        obj1.put("Love" , "Yourself");
	        System.out.println(obj1);
	}
	
}
