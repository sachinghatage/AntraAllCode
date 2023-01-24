package day4b;

public class Minor extends Uber{

	Minor() { super(y); y = y + 3; }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Minor();
		System.out.println(y);
	}

}
