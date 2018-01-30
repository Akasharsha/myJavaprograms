package training3;

public class Exception {
	public static void main(String[] args) {
		
		int[] x= new int[3];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		
		int a=10;
		int b=0;
			//Try Catch block implementation//
		try{
			x[3]=40;
			int c=a/b;
		}
							//Arithmetic Exception Implementation//
			catch (ArithmeticException e){
				System.out.println("Akash is learning java");
			
			}
									//ArrayIndexOutOfBound Exception//
	catch(ArrayIndexOutOfBoundsException f){
		System.out.println("Akash is learning Exception");
	}
			
		finally{				//finally keyword//
			System.out.println("inside finally block");
		}
			System.out.println("After exception handling");
			
			
	}
		}
	
			
			

		
	


		
	



