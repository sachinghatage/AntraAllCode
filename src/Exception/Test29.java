
public class Test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("ABC");
			int x = 1 / 0;
			}
			catch(ArithmeticException ae){
			System.out.println("PQR");
			System.exit(0);
			}
			finally {
			System.out.println("XYZ");
	}

}
}