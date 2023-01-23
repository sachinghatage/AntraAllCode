
public class Test33 {

	int m1(){
		try {
		System.out.println("ABC");
		int x = 1/0;
		return 50;
		}
		catch(ArithmeticException ae)
		{
		System.out.println("I am in catch block");
		return 40;
		}
		finally{
		return 60;
		}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test33 t = new Test33();
		System.out.println(t.m1());
	}

}
