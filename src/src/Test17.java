
public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("111");
		try

		{
		System.out.println("222");
		int y = 1/0;
		}
		catch(ArithmeticException e)
		{
		try
		{
		System.out.println("Hello");
		double x = 2.5/0;
		System.out.println("Java");
		}
		catch(NullPointerException np)
		{
		System.out.println("333");
		}
		}
		System.out.println("444");
	}

}
