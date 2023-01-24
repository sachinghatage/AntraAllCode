package saturday;

public class B extends A{

	
	public void start() {
		System.out.println("test B");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

      ((A)new B()).start();		
	}

}

class A{
	public void start() { System.out.println("TestA"); }
}