package day4;

public class Clidlet extends Clidder{

	public final void flipper() { System.out.println("Clidlet"); }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Clidlet().flipper();
	}

}

class Clidder{
	
	private final void flipper() { System.out.println("Clidder"); }
}