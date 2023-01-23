
public class Test32 {

	int m1(){
		try {
		System.out.println("ABC");
		int x = 1/0;
		return 50;

		}
		catch(ArithmeticException ae)
		{
		System.out.println("I am in catch block");
		}
		return 10;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test32 t = new Test32();
		System.out.println(t.m1());
	}

}
