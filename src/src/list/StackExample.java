package list;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s=new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.pop();       //removes last digits
		s.pop();
		s.add(6);
		s.add(7);
		
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
