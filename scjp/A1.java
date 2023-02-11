package scjp;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		parse("invalid");
	}

	static float   f;           //if added this line compiles fine
	private static void parse(String string) {
		// TODO Auto-generated method stub
		try {
			float f=Float.parseFloat(string);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
               f=0;                                     //compilation fails f cannot be 
                                                        //resolved to a variable
           }
		finally {
			System.out.println(f);
		}
	}

}
