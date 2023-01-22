package day1;

import java.util.StringJoiner;

public class ToggleWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="this is java";
        String toggle="";
		String[] arr = s.split(" ");
		for(String w:arr) {
			StringBuffer sb=new StringBuffer(w);
			sb.reverse();
			String f=sb.substring(0,1);
			String l=sb.substring(1);
			toggle+=f.toLowerCase()+l.toUpperCase()+" ";
			

	}
		System.out.println(toggle);

		

}
}