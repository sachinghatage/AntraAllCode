
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
			try {                                       //prints values from 1 to 5
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println(c);
			}
			catch (ArithmeticException ae) {
			}
	}

}
}