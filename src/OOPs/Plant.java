package day3;

public class Plant {
	private String name;
	public Plant(String name) { this.name = name; }
	public String getName() { return name; }
	
	//public Plant() { Tree(); }             -> won't compile
	
	 public Plant() { this("fern"); }    //  ->compiles fine
	
	 //public Plant() { Plant("fern"); }     ->won't compile
	
}

 class Tree extends Plant {
	 
		
	 
	// public Tree() { Plant(); }  //won't compile,Implicit super constructor Plant() is undefined.
	 
	 
	 
	 public void growFruit() { }
 public void dropLeaves() { }
 }
 