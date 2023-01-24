package day3e;

public class Gamma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer o=new Outer();
		Inner i=new Inner();
		int n=10;
		i.setX(n);
     	o.setY(i);
	//	i.setX(100);
    // 	o.getY().setX( 100 );
     //	i = new Inner();
     
     //	o.setY( i); i = new Inner(); i.setX( 100 );
     //	i = new Inner(); i.setX( 100 ); o.setY( i );
		System.out.println(o.getY().getX());
	}

}
