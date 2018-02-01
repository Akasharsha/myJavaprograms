package training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Generics {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Akash");
		list.add("Harsha");
//		list.add(new Practice());  we cannot add class except Strings
		
		for (int i = 0; i < list.size(); i++) {
			String s=list.get(i);
			System.out.println(s);
			
		}
		
		
		
		//Generics in Set
		
		Set<String> set=new HashSet<String>();
		
		set.add("Java");
		set.add("Training");
//		set.add(new Practice()); //we cannot add class
		
		Iterator<String> it=set.iterator();
		while(it.hasNext()){
		String s=it.next();
		System.out.println(s);
		}
		
		
		Map<String, String> map=new HashMap<String, String>();
		
		map.put("Ramji", "class");
		map.put("doing", "well");
		
		Set<String> m=map.keySet();
		Iterator<String> itr =m.iterator();
		while(itr.hasNext()){
		String key=itr.next();
		String value=map.get(key);
		System.out.println(key);
		System.out.println(value);
		}
		
	}
		
		
	}


