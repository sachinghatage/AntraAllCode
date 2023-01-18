package day1;

import java.util.StringJoiner;

public class ToggleWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="this is java";
		s=s.toUpperCase();
		String s1="";

		String[] arr = s.split(" ");
		
		for(int i=0;i<=arr.length-1;i++) {
			StringBuffer sb= new StringBuffer(arr[i]).reverse();
			String f=sb.substring(0,1).toLowerCase();
			String l=sb.substring(1);
			StringJoiner sj = new StringJoiner(f,l," ");
			s1=s1+sj;
			
	}

		System.out.println(s1);

}
}