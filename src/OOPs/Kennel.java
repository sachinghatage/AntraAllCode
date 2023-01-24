package day4a;

public class Kennel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Beagle b1 = new Beagle();
		 Dog dog1 = new Dog();
		 Dog dog2 = b1;
	//	 Beagle b3 = (Beagle) dog2;  //compiles fine
	//	 Beagle b2 = (Beagle) dog1;   //doesnot compiles
		// Beagle b4 = dog2;      //doesnot compiles
	}

}
