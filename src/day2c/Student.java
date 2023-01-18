package day2c;

public final class Student {
	private String name;
	private Age age;
	public String getName() {
		return name;
	}
	
	public Age getAge() {
		return age;
	}

	public Student(String name, Age age) {
		
		this.name = name;
		this.age = age;
		
		//this is added to give immutability
		Age clon=new Age();
		clon.setYear(age.getYear());
		this.age=clon;
	}
	
}
