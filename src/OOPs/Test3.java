package saturday;

abstract class Vehicle {
	public int speed() { return 0;}
}

class Car1 extends Vehicle{
	 public int speed() { return 60;}
}

class RaceCar extends Car1{
	public int speed() { return 150; }
}

class Test3{
  
	public static void main(String[] args) {
	  RaceCar racer = new RaceCar();
	   Car1 car = new RaceCar();
	   Vehicle vehicle = new RaceCar();
	   System.out.println(racer.speed() + ", " + car.speed()
	   + ", " + vehicle.speed());
  }
}