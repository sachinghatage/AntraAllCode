
public class Demo4 {

static	void f1()
	{
	try
	{
	String s="sathya Technologies";
	System.err.println(s.charAt(15));
	}
	catch(Exception e)
	{
	System.err.println(e);
	}
	catch(StringIndexOutOfBoundsException se)   //unreachable catch block
	{
	System.err.println(se);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     f1();
	}

}
