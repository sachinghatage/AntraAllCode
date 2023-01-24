package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		hs.add("aman");
		hs.add("karan");
		hs.add("kevin");
		hs.add("tarun");
		hs.remove("aman");
		
		Iterator<String> i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
