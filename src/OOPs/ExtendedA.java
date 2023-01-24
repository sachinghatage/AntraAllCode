package day3d;

public class ExtendedA extends ClassA{

	private ExtendedA(int numberOfInstances) {
       super(numberOfInstances);
	}
     
       
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ExtendedA ext = new ExtendedA(420);
		 System.out.print(ext.numberOfInstances);
	}

}
