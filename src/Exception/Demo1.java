
public class Demo1 {

	static void f1()
	{
	try
	{
	int x=10,y=0,z;
	z=x/y;
	}                           //after this finally or catch block required
	
	try
	{
	int a[ ]={12,35,8,46};
	System.out.println(a[6]);
	}
	catch(Exception e)
	{
	System.err.println(e);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   f1();
	}

}
