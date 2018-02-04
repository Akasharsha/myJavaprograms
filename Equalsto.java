package training1;

public class Equalsto {
	public static void main(String[] args) {
		
		String a="akash";
		String b="harsha";
		if(a==b){				//double equalto
			System.out.println("mission accomplished");
		}
		else{
			System.out.println("mission failed");
		}
		
		
		Car c2=new Car();
		c2.carnum=1234;
		c2.carmodel=2816;
		c2.caryear=2018;
		Car c1=new Car();
		c1.carnum=1234;
		c1.carmodel=2816;
		c1.caryear=2018;
		System.out.println(c2.equals(c1));
	}

}

class Car{
	int carnum;
	int carmodel;
	int caryear;
	
	
	public boolean equals(Object obj) {
		Car c=(Car)obj;
		if (this.carnum == c.carnum && this.caryear == c.caryear) {
			return(true);
			}
		else{
			return(false);
		}
		
		
	}
}
