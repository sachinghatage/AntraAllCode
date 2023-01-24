package day4;

public class One {

	public One foo() { return this; }
}


class Two extends One {
	
 public One foo() { return this; }
 }


 class Three extends Two {
	// public void foo() {}    //doesnot compile compile due to return type
	// public int foo() { return 3; }     //doesnot compile compile due to return type
	// public Two foo() { return this; }   //compiles fine
	// public One foo() { return this; }     //compiles fine
	// public Object foo() { return this; }  //doesnot compile due to return type
 }