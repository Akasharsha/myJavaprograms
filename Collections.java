package training3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
//		List list=new ArrayList();
//		list.add("abc");
//		list.add("def");
//		list.add(new sample());
//		
//		int size=list.size();
//		System.out.println(size);
//		
//		for (int i = 0; i < list.size(); i++) {
//			Object o=list.get(i);
//			if(o instanceof String){
//				String s=(String)o;
//				System.out.println(s);
//			}
//			else if(o instanceof Object){
//				Object s=(Object)o;
//				System.out.println(s);
//			}
//			
//		}
		
//		Set set=new HashSet();
//		set.add("sunil");
//		set.add("vamshi");
//		set.add(new sample());
//		
//		int size=set.size();
//		System.out.println(size);
//		
//		Iterator it=set.iterator();
//		while(it.hasNext()){
//			Object o=it.next();
//			if(o instanceof String){
//				String s=(String)o;
//			    System.out.println(s);
//			}
//			else if(o instanceof Object){
//				Object s=(Object)o;
//				System.out.println(s);
//			}
//		}
		
		Map map=new HashMap();
		map.put("akash", "harsha");
		map.put("sunil", "gubbala");
		map.put("vamshi", "mesi");
		
		int size=map.size();
		System.out.println(size);
		
		Set m=map.keySet();
		Iterator it=m.iterator();
		while(it.hasNext()){
			Object o=it.next();
			if(o instanceof String){
				String key=(String)o;
				String value=(String)map.get(key);
			    System.out.println(key);
			    System.out.println(value);
			}
			else if(o instanceof Object){
				Object key=(Object)o;
				Object value=(Object)map.get(key);
				System.out.println(key);
				System.out.println(value);
			}
		}
	}
}
