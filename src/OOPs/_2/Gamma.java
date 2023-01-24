package saturday;

public class Gamma {

	static Foo fooBar(Foo foo) {
		foo=new Foo(100);
		return foo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Foo foo=new Foo(300);
		System.out.println(foo.getX()); //300
		
		
		Foo f=fooBar(foo);
		System.out.println(foo.getX());
		System.out.println(f.getX());
		
		
		foo=fooBar(f);
		System.out.println(foo.getX());
		System.out.println(f.getX());
	}
	
	

}

class Foo{
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Foo(int x) {
		
		this.x = x;
	}
	
}
