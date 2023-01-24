package saturday;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee("1234");
		System.out.println(e.empId);
	}

}

class Person{
	String name="no name";
	public Person(String nm) {
		name=nm;
	}
}

class Employee extends Person{
	String empId="0000";
	public Employee(String id) {
		super(id);
		empId=id;
		
	}
}