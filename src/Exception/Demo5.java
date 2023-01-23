
public class Demo5 {

	static void f1()
	{
	try
	{
	String s="sathya Technologies";
	System.err.println(s.charAt(15));
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
	System.err.println(ae);
	}
	catch(StringIndexOutOfBoundsException se)
	{
	System.err.println(se.toString());
	}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     f1();
	}

}
