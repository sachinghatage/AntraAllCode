package list;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v1=new Vector();
		v1.add("kamal");
		v1.add("mahesh");
		v1.add("karim");
		v1.add("benzema");
		
		//v1.clear();               //removes everything from array
		
         Iterator i=v1.iterator();
         while(i.hasNext()) {
        	 System.out.println(i.next());
         }
	}

}
