
public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("111");
		try
		{
		System.out.println("222");
		}
		catch(ArithmeticException e)
		{
		try
		{
		double x = 2/0;
		}
		catch(NullPointerException np)
		{
		}
		}
		System.out.println("ABC");
	}

}
