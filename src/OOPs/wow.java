package day3;

public class wow {

	public static void go(short n) {System.out.println("short");}
	 public static void go(Short n) {System.out.println("SHORT");}
	 public static void go(Long n) {System.out.println(" LONG");}
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Short y = 6;
		 int z = 7;
		 go(y);
		// go(z);   //The method go(short) in the type wow is not applicable for the arguments (int)
	}

}
