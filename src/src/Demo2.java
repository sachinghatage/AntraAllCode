
public class Demo2 {

	static void f1()
	{
	try
	{
	int a[ ]={12,35,8,46};
	System.out.println(a[6]);
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
	System.err.println(ae);
                                             //first AIOOBE arises
	}
	try
	{
	String s="sathya Technologies";
	System.err.println(s.charAt(15));
	}
	catch(StringIndexOutOfBoundsException se)
	{
	System.err.println(se);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		f1();
	}

}
