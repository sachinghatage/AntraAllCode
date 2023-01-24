package day3b;

public class Sub extends Super{

	 public Sub(int a) 
	 {
		 super(a);
	}
	 public Sub() 
	 {
		 this(5);
		//super(5);
		// super(a);//Cannot refer to an instance field a while explicitly invoking a constructor
		 
	 }
}
