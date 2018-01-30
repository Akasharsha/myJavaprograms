package training1;

public class ThisKeyword {

	int a=6;
			public static void main(String[] args) {
				ThisKeyword obj= new ThisKeyword();
				obj.m1();
				System.out.println(obj.a);
				
			}
			
			void m1(){
				int a=8;
				this.a=12;
				this.a=a;
				
				System.out.println("Value of a is" + a);
				//System.out.println(obj.a);
			}
}
