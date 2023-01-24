package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll=new LinkedList<String>();
		ll.add("ramesh");
		ll.add("raghav");
		ll.add("suresh");
		ll.add("kamlesh");
		ll.remove();
		ll.remove(2);
		ll.set(1, "rakesh");
       Iterator i=ll.iterator();
       while(i.hasNext()) {
    	   System.out.println(i.next());
       }
	
	}

}
