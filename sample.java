package training3;




public class sample {
	
	int i;

	
	public static void main(String[] args)  {
		
		
		sample obj= new sample();
		obj.m1();
		
	}
	void m1()  {	
		
		try{
			int a=10/0;
		}
		catch(ArithmeticException e){
			System.out.println("AE exception handled");
		}
			
	
		}
		
	
	protected void finalize() throws Throwable {
		System.out.println("Cleaning started");
	}
		
		
		
	
		
		
	}
	
	
