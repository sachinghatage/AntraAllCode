
public class Test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			try {
				method();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			finally{
			System.out.println("I am in finally block");
			}
			}
			static void method() throws Exception {
			try {
			int[] list = new int[5];
			System.out.println(list[0]);
			try {
			System.out.println(list[5]);
			}
			catch(ArithmeticException ae){
			System.out.println("I am in inner catch block");

			}
			}
			catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("I am in outer catch block");
	}

}
}