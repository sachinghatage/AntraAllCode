package scjp;

public class Threads2 implements Runnable{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run");
		throw new RuntimeException("problem");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t=new Thread(new Threads2());
		t.start();
		System.out.println("end");
	}

	
}
