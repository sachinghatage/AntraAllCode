package day2b;

public class Person {

	 private String name;
	 private int age;
	 public Person(String name, int age)
	 {
	 this.name = name;
	 this.age = age;
	 }
	
	 
	 public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String toString()
	 {
	 return getName() + " " + getAge();
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("Destini", 20);
		 System.out.println(p);
		 Teacher p2 = new Teacher("Erica", 55, "Masters in Teaching");
		 System.out.println(p2);

		
	}

}


class Teacher extends Person
{
 String degree;
 public String getDegree() { return this.degree; }
 
 
 public void setDegree(String degree) {
	this.degree = degree;
}


public String toString()
 {
 return getName() + " " + getAge() + " " + getDegree();
 }
 public Teacher(String name, int age, String degree)
 {
   super(name,age);
   this.degree=degree;
 }
}
