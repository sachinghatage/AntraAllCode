
public class C {

	A m1() {
		return new A();
		
	}
}

class D extends C{
	
	A m1() {
		return new B();
		
	}
}