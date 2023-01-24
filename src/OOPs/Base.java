package day3;

public class Base {

	public static final String FOO = "foo";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Base b = new Base();
		 Sub s = new Sub();
		 Base b1=new Sub();   //data member of parent is called,but if there is a method then child's method is used
//		 System.out.print(Base.FOO);
//		 System.out.print(Sub.FOO);
//		 System.out.print(b.FOO);
//		 System.out.print(s.FOO);
//		 System.out.print(((Base)s).FOO);
		System.out.println(b1.FOO);         
	}

}

class Sub extends Base
{
	public static final String FOO="bar";
}
