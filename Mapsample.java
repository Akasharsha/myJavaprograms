package training;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapsample {
	public static void main(String[] args) {
		
		Map obj=new HashMap();
		obj.put("Akash","Harsha");
		obj.put("java","training");
		obj.put("doing", "well");
		
		int size=obj.size();
		System.out.println(size);
		
//		Object o=obj.get("Akash");
//		System.out.println(o);
		
		Set s=obj.keySet();
		Iterator x=s.iterator();
		while(x.hasNext()){
			Object p=x.next();
			if(p instanceof String){
				String keys=(String)p;
				String value=(String)obj.get(keys);
				System.out.println(keys);
				System.out.println(value);
			}
			else if(p instanceof Object){
				Object keys=(Object)p;
				Object value=(Object)obj.get(keys);
				System.out.println(keys);
				System.out.println(value);
			}
		}
	}

}
