
public class Demo7 {

static	void f1()
	{
	try
	{
	int x=10,y=0,z;
	z=x/y;                                         //arithmatic exception
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   f1();
	}

}
