package day3;

public class Beta extends Alpha{
	
		public void foo(String a) {
			System.out.println("Beta foo");
		}
		
		public void bar(String a) {
			System.out.println("beta bar");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alpha a=new Beta();
		Beta b=(Beta)a;
		
		a.foo("test");
		b.foo("test");
		a.bar("test");
		b.bar("test");
		
	}

}
