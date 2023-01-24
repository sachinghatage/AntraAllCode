package day4;

public class Animal {

	public String noise() {
		return "peep";
	}
}

class Dog extends Animal{
	public String noise() {
		return "bark";
	}
}

class Cat extends Animal {
	public String noise() {
		return "meow";
	}
}
