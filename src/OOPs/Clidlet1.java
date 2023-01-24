package day4;

public class Clidlet1 extends Cladder1{

//	public void flipper() {                        //compile error cannot override final method
//		System.out.println("Flip a Clidlet");
	//	super.flipper();
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Clidlet1().flipper();
	}

}

class Cladder1{
	
	public final void flipper() { System.out.println("Clidder"); }
}