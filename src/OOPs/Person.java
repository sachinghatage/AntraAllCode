package day2;

public class Person {

	 public void speak()
	 {
	 System.out.println("I'm a person");
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Student1();
		 p1.speak();
		
	}

}

class Student1 extends Person{
	public void speak() {
		System.out.println("I'm a student");
	}
}
