package day2;

public class Pet {
	
	public void brag()
	 {
	    System.out.println("I have the best pet!");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog1 d1 = new Dog1();
		 d1.brag();
		
	}

}


class Dog1 extends Pet
{
 public void brag()
 {
     super.brag();
    System.out.println("I have the best dog!");
 }
}
