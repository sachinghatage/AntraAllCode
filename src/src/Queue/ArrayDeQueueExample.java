package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDeQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> dq=new ArrayDeque<>();
		dq.add("shravan");
		dq.add("rohan");
		dq.add("kabil");
		dq.addFirst("navin");
		System.out.println(dq.getFirst());
		System.out.println(dq.offer("rohan"));
		Iterator i=dq.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
