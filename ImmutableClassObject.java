package mypackage;

public final class ImmutableClassObject {
	
	private final int id;
	private final String name;
	private final Age age;
	
	
	public ImmutableClassObject(int id,String name,Age age){
		this.id=id;
		this.name=name;
		
		//By using this clone object we can make a class immutable. If we do not use this
		//there is  a chance to modify values in immutable class by using setter methods in dependent class(Age)
		Age clone = new Age();
		clone.setDate(age.getDate());
		clone.setMonth(age.getMonth());
		clone.setYear(age.getYear());
		this.age=clone;
		
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Age getAge() {
		return age;
	}
	

}
