
public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int[] list = new int[10];
			System.out.println("list[10] is " + list[10]);
			}
			catch (ArithmeticException ex) {
			System.out.println("ArithmeticException");
			}
			catch (RuntimeException ex) {
			System.out.println("RuntimeException");
			}
			catch (Exception ex) {
			System.out.println("Exception");
	}

}
}