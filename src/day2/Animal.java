package day2;

abstract public class Animal {

	public String name;
	 public int numLegs;
	 public abstract void speak();
	 public abstract void eat();
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog2 myDog = new Dog2();
		 myDog.speak();
		 myDog.eat();
	}

}


 class Dog2 extends Animal
{
  public  void speak() {
    	System.out.println("woof");
    }
  
  public void eat() {
	  System.out.println("num num");
  }
 public static void main(String[] args)
 {
 Dog2 myDog = new Dog2();
 myDog.speak();
 myDog.eat();
 }
}
