package scjp;

public class Tester implements Runnable {

	static PingPong2 pp2=new PingPong2();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread(new Tester()).start();
		new Thread(new Tester()).start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		pp2.hit(Thread.currentThread().getId());
	}

}

class PingPong2{
	synchronized void hit(long n) {
		for(int i=1;i<3;i++) {
			System.out.println(n+" - "+i+" ");
		}
	}
}