
public class Test27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("ABC");
			int a = 5, b = 10, c = 5;
			a += 5;
			b -= a + c;
			int x = (a + b)/(b + c);
			System.out.println(x);
			System.exit(0);
			}
			catch(ArithmeticException ae){
			System.out.println("PQR");
			}

			finally{
			System.out.println("XYZ");
	}

}
}