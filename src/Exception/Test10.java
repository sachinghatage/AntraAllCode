
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int value = 5;
			if (value < 10)
			throw new RuntimeException("Value is less than 10");
			}

			catch (RuntimeException re) {
			System.out.println(re.getMessage());
			}
			System.out.println("Outside try-catch block");
	}

}
