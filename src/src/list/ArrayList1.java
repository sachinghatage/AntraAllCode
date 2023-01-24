package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al =new ArrayList<>();
		al.add("amit");
		al.add("avinash");
		al.add("akshay");
		al.add("aniket");
		al.remove(0);
		al.remove("aniket");
		al.set(1, "sanjay");
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
