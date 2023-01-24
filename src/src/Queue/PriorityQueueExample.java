package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("amit");
		pq.add("karan");
		pq.add("sanjay");
		pq.offer("karan");
        System.out.println(pq.peek());
        
       Iterator i=pq.iterator();
       while(i.hasNext()) {
    	   System.out.println(i.next());
       }
}

}
