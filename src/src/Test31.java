
public class Test31 {

	int m1() {
		try {
		System.out.println("ABC");
		return 50;
		}
		catch(Exception e)
		{
		System.out.println("I am in catch block");
		}
		return 10;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test31 t = new Test31();
		System.out.println(t.m1());
	}

}
