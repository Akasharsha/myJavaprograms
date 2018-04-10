package mypackage;

public class Test {

	public static void main(String[] args) {
		
		
		
		Age age = new Age();
		age.setDate(27);
		age.setMonth("aug");
		age.setYear(1992);
		
		ImmutableClassObject obj = new ImmutableClassObject(10, "akash", age);
		
		System.out.println(obj.getAge().getMonth());
		age.setMonth("nov");
		System.out.println(obj.getAge().getMonth());
	}
}
