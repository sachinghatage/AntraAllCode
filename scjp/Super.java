package scjp;

public class Super {
private int a;
protected Super(int a) {
	this.a=a;
}
}

class Sub extends Super{
	
	
	Sub(){
		this(5);
	}
	
	
	Sub(int a){
		super(a);
	}
	
	
	
}