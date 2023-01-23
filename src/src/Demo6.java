
public class Demo6 {

static	void f1()
	{
	try
	{
	int x=10,y=2,z;
	z=x/y;
	}                                                //first finally block is executed and then exception occurs for y=2
	finally
	{
	System.err.println("hello");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   f1();
	}

}
