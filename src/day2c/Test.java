package day2c;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Age a=new Age();
		a.setYear(1997);
		Student s=new Student("sachin",a);
		System.out.println(s.getAge().getYear());
		a.setYear(1992);
		System.out.println(s.getAge().getYear());
	}

}
