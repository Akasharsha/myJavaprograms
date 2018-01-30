package training1;

public class F {
public static void main(String[] args) {
	
	carOwner obj=new carOwner();
	obj.name="sunil";
	obj.mobile=1234567890;
	obj.zipcode=07666;
	
	car obj1=new car();
	obj1.carnum=6666;
	obj1.carmodel="dodge";
	obj1.carOwner=obj;
	
	
	vehicle obj3=new vehicle();
	obj3.engine=4567;
	obj3.gear= 1234;
	obj3.tyres=3;
	
	
	
}	
	
}

  class vehicle {
	
	int engine;
	int gear;
	int tyres;
  
	
	void start(){
		
	}
	void change(){
		
	}
	void rotate(){
	}

}

  class carOwner{	//has a relation:composition//
	  String name;
	  int mobile;
	  int zipcode;
  }
class car extends vehicle {	//is a relation:Inheritance//
	int carnum;
	String carmodel;
	carOwner carOwner;
	
}
