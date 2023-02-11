package scjp;

public class Barn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Barn().go(1,"hi");
		new Barn().go(2,"hi","world");
	}

	public void go(int x,String...y) {            //always var-args should be at last.
		System.out.println(y[y.length-1]+"");
	}
}
