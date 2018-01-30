package training3;

import java.io.IOException;

public class ThrowAndThrows {
	
	public static void main(String[] args) throws IOException {	//Using Throws keyword
		
		int a=10;
		int b=0;
		try{
			int c=a/b;
		}
		catch(ArithmeticException e){
			System.out.println("Inside throw AE");
		
		}
			//Using Throw keyword
	throw new IOException();
	}
	

}


	
	
	
	 

