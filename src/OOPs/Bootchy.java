package day4;

public class Bootchy {

	int bootch;
	String snootch;
	
	public Bootchy() {
		this("snootchy");
		System.out.println("first");
	}
	
	public Bootchy(String snootch) {
		this(420,"snootchy");
		System.out.println("second");
		
	}
	
	public Bootchy(int bootch,String snootch) {
		this.bootch=bootch;
		this.snootch=snootch;
		System.out.println("third");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bootchy b=new Bootchy();
		System.out.println(b.snootch);
		System.out.println(b.bootch);
	}

}
