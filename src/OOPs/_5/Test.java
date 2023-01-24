package saturday;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		A2 b =new A2();
		b.process();
	}

}
  class A2{
	 void process() throws Exception { throw new Exception(); }
 }
 
 
  class B2 extends A2 {
	 void process()  { System.out.println("B"); }
 }