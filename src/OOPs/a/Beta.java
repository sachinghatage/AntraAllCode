package saturday.a;

public class Beta extends Alpha{

//	public void bar(int x) {}        //compiles fine
//	public Alpha bar(int x) {}        //parent return type required
//	private void bar(int x) {}          //cannot reduce visibility
	
//	public void bar(int x,int y) {}     //compiles fine
	
	public  int bar(String x) {
		return 1;
		
	}
}

