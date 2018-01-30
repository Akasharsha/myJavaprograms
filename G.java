package training1;


public class G {
	public static void main(String[] args) {	//to.String method//
		G obj=new G();
		String str= obj.toString();
		System.out.println(str);
		I obj2=new I();
		obj2.m1();
		J obj3= new J();
		obj3.m3();
		obj3.m4();
		
		
	}
}



abstract class H {			//Abstract methods//
	
	abstract void m1();
	
	void m2(){
		System.out.println("inside class H m2");
		
	}
	}
class I extends H{	//single Inheritance:type of Inheritance//
	void m1(){
		System.out.println("inside class I m1");	//abstract m1 method is over rided
	}
}

//Interface concept //
 interface Z{
	 void m3();
	 void m4();
	 
	 }
 class J implements Z{	//implements keyword
	 public void m3(){
		 System.out.println("inside class J implements Z m3");
	 }
	 public void m4(){
		 System.out.println("inside class J implements Z m4");
	 }
	 interface Y{
		 void m3();
	 }
class K implements Y,Z{	//multiple Inheritance:type of Inheritance//
		 public void m3(){
			System.out.println("inside class K implements Z,K m3");
		 }
		 public void m4(){
			 System.out.println("inside class K implements Z m4");
			 
		 }
	 }
	 
 }
