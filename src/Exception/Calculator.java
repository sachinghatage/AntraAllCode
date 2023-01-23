import java.util.Scanner;

public class Calculator {

	int a;
	int b;
	
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calculator(int a, int b) {
		
		this.a = a;
		this.b = b;
	}
	
	void add(int a,int b) {
		if(a>0  && b>0) {
			System.out.println(a+b);
		}
		else {
			throw new ArithmeticException();
		}
		
	}
	
	void substract(int a,int b) {
		if(a>0  && b>0) {
			System.out.println(a-b);		}
		else {
			throw new ArithmeticException();
		}
	}
	
	void multiply(int a,int b) {
		if(a>0  && b>0) {
			System.out.println(a*b);		}
		else {
			throw new ArithmeticException();
		}
	}
	
	void divide(int a,int b) {
		if(a>0  && b>0) {
			System.out.println(a/b);		}
		else {
			throw new ArithmeticException();
		}
	}
	public static void main(String[] args) {
 

	Calculator c =new Calculator();
	
	
	try {
		Scanner scan =new Scanner(System.in);
		System.out.println("first value");
		 
		String f=scan.nextLine();
		String l=scan.nextLine();
		c.add( Integer.parseInt(f), Integer.parseInt(l));
	    c.substract(Integer.parseInt(f), Integer.parseInt(l));
		c.multiply(Integer.parseInt(f), Integer.parseInt(l));
		c.divide(Integer.parseInt(f), Integer.parseInt(l));
	}
	catch(NumberFormatException e){
		System.err.print("wrong input");
	}
	
		
	
		
	}

}
