package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts=new TreeSet<>();
		ts.add("karuna");
		ts.add("chandan");
		ts.add("kaveri");
		ts.add("kamal");
		ts.add("chandan");
		ts.remove("chandan");
	   
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts.ceiling("chandan"));
		Iterator<String> i=ts.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
