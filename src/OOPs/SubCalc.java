package saturday;

public class SubCalc {

	protected static int multiply(int a, int b) { return a * b;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubCalc sc = new SubCalc ();
		 System.out.println(sc.multiply(3,4));
		 System.out.println(SubCalc.multiply(2,2));
	}

}

class SuperCalc extends SubCalc{
	
//	public static int multiply(int a, int b) {
//	 int c = super.multiply(a, b);            //cannot use super keyword in static method
//		 return c;
}
//}