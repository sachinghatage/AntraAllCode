package saturday.b;

public class C extends B{
	
	public void add(C c) { c.getValue(); }    
	
	public void add(B b) { b.getValue(); }  //represents polymorphism
	
	public void add(A a) { a.getValue(); }  //represents polymorphism
	
	public void add(A a, B b) { a.getValue(); }  //represents polymorphism
	
	public void add(C c1, C c2) { c1.getValue(); }

}
