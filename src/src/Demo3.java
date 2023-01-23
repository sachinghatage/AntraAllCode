
public class Demo3 {

  static	void f1()
	{
	try
	{
	int x=10,y=8,z;
	z=x+y;
	}
	catch(Exception e)
	{
	System.err.println(e);
	}
	finally
	{
	System.err.println(z );    //z is local
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     f1();
	}

}
