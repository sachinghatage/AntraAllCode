
public class Test30 {

	int m1(){
		try {
		System.out.println("ABC");
		return 50;
		}
		catch(Exception e)
		{
		System.out.println("I am in catch block");
		}
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test30 t = new Test30();
		t.m1();
	}

}
