package training;

	
public class B {

	B(){											//Constructor overloading:B//
		System.out.println("inside class B cnstr");
	}
	B(int a){
		System.out.println("inside class B one arg cnstr");
	}
	static int a=2;
	static int b=3;			//Static int  variables declaration 
	static String c="Akash";
	static String d="Cheggoju";		//Static String variables decalaration
	
	public static void main(String[] args) {
		
		B obj=new B();
		int f=obj.add(8, 9);
		System.out.println(f);
		String g= obj.add(c, d);
		System.out.println(g);
		obj.m1();
		
	//Polymorphism concept//	
		
	}
	
	int add(int a,int b){		//method overloading :add//
		
		return(a+b);
	}
	String add(String c, String d){
		System.out.println(c+d);
		return(c+d);
		
	}
	void m1(){
		B obj= new C();
		 obj.m1();
		
		System.out.println("Akash learnig Java");
	}
}

class C extends B{	//Inheritance concept using extends keyword//
	
	
	 
	void m1(){
		System.out.println("Akash is learning core java");	//method over riding :m1//
		super.add("Java", "learning");		//Super class//
	}
	
}
	

