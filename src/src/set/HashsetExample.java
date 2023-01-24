package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> s=new HashSet<String>();
		s.add("akash");
		s.add("amit");
		s.add("madan");
		s.add("akash");
        //s.clear();
		s.remove("amit");
   Iterator i=s.iterator();
   while(i.hasNext()) {
	   System.out.println(i.next());
   }
	}

}
