package training1;

import training.A; //Import package using Import keyword//



public class D {

	int p;
	public int q;
	private int r;
	protected int s;
	final int t=2;

	public static void main(String[] args) {
		int h=D.add(5, 6);
		A obj=new A();	//We need a object to call the Non static methods//
		obj.add2();
		System.out.println(h);
		
		D obj2=new D();
		System.out.println(obj2.add(2,3,4));
		
		E obj3=new E();
		System.out.println(obj3.add(2,3));
		
		
		
	}
	
	static int add(int a,int b){	//Calling the instance variables from Class A,training package//
		
		return(a+b);		//Using the instance variables in Static methods//
	}
	
	int add(int p,int q,int r){
		return(p+q+r);
		
	}
	
}
	class E {
		int add(int s,int t){
			return(s+t);
	
}
	}
