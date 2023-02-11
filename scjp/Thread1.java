package scjp;

public class Thread1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread());
		new Thread1().signal();
	}

            void signal() throws InterruptedException {
		// TODO Auto-generated method stub
		Object obj=new Object();
		System.out.println(Thread.currentThread());
		
		
		synchronized(Thread.currentThread()) {
			Thread.currentThread().wait();
			Thread.currentThread().notify();
		}
	}

}
