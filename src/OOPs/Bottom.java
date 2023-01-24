package day4;

public class Bottom extends Top{

	public Bottom(String s) { System.out.print("D"); }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Bottom("C");         //first default constructor of parent class is executed
		                          //and then childs
		System.out.println(" ");
	}

}

class Top{
	
	
	Top(){
		
	}

	
	public Top(String s) { System.out.print("B"); }

}