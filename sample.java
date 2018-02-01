package training;


import java.util.ArrayList;
import java.util.List;



public class sample {


	   public static void main(String args[]){
		  
		   List list = new ArrayList();
		   list.add("Akash");
		   list.add("learning");
		   list.add("java");
		   list.add(new Exception());
		   
		   int size= list.size();
		   System.out.println(size);
		   
//		   Object s= list.get(3);
//		   System.out.println(s);
		   for (int i = 0; i < list.size(); i++) {
			   Object s=list.get(i);
			   if(s instanceof String){
				   String x=(String)s;
				   System.out.println(x);
			   }
				   else if (s instanceof Object) {
					   Object x=(Object) s;
					   System.out.println(x);
					
				}
	   }
			
		}
		  	   
	  }
	