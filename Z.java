package training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public  class Z {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add("Akash");
		list.add("Vamshi");
		list.add("sunil");
		list.add("krishna");
		list.add("hari");
		list.add("Rohit");
		list.add(new Practice());
		
		System.out.println (list.contains("hari"));
		
		System.out.println("Past members of 662 are" +list);
		
		list.add(0, "Akash Harsha");
		list.add(1,"Vamshi Mesi");
		list.remove("Akash");
		list.set(0, "Harsha");
		
		System.out.println("Current members of 662 are" +list);
		
		
	}
}

	
