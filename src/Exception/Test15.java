
public class Test15 {

	
	int x = 30, y = 0;
	void divide()
	{
	System.out.println("I am in method");
	try
	{
	System.out.println("I am in try block");

	int z = x/y;
	System.out.println("Result of z: " +z);
	}
	catch(NullPointerException np)
	{
	System.out.println("I am in catch block");
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test15 t = new Test15();
		t.divide();
		
	}

}
