package day3;

public class Hello {

	String title;
	 int value;
	 public Hello() 
	 {
	   title += " World";
	 }
	 public Hello(int value) 
	 {
		 
	   this.value = value;
	    title = "Hello";
	  //  Hello();           //constructor call must be first statement.
	 }
	 
	
	 Hello c = new Hello(5);
	// System.out.println(c.title);
}
