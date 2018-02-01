package training;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setsample {
	
	public static void main(String[] args) {
		
		Set obj=new HashSet();
		obj.add("Ramji");
		obj.add("teaching");
		obj.add(new Exception());
		
		int size=obj.size();
		System.out.println(size);
		
		Iterator it=obj.iterator();
		
		while(it.hasNext()){
			Object o=it.next();
			if(o instanceof String){
				String s=(String)o;
				System.out.println(s);
			}
			else if(o instanceof Object){
				Object s=(Object)o;
				System.out.println(s);
			}
		}
	}

}
