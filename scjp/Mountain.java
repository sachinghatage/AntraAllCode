package scjp;

class Atom{
	Atom(){
		System.out.println("atom");
	}
}
class Rock extends Atom{
//	Rock(){
//		System.out.println("rock");
//	}
	Rock(String type){
		System.out.println(type);
	}
}
public class Mountain extends Rock{

	Mountain(){
		super("granite");
		new Rock("granite");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Mountain();
	}

}
