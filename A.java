package training;

public class A {
	public A(){
		System.out.println("inside class A constructor"); //Constructors
	}
	A(int a){
		System.out.println("inside class A with one arg constructor ");
	}
	int a=5;
	int b=6;		//Instance variables declaration
	String c="Akash";
		public static void main(String[] args) {
			A obj= new A();		//creating an Object
			obj.add();			//calling a method add
			obj.add2();
			
		
			}
	
		void add(){					//creating a method add
		System.out.println(a+b);
	}
		public void add2(){
			System.out.println(a+b+c);	//Using Concatination method
		} 
		
		
}
