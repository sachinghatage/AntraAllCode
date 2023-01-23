
public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		int[] list = new int[5];
		System.out.println(list[5]);
		}
		catch(StringIndexOutOfBoundsException e)
		{
		try {
		System.out.println("ABC");
		int x = 10/0;
		}
		catch(ArithmeticException ae){
		}
		}
		System.out.println("ABC");
	}

}
