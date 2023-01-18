package day1;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s= {"sachin","rohit","rahul","rahul","sachin","sachin"};
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i]==s[j])
					System.out.println(s[i]);
				
			}
		}
		
			
	}}


