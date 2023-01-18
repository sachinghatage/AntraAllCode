package day1;

public class Swap {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Antra";
		int n=2;
		String rev="";
		for(int i=s.length()-(n);i<s.length();i++) 
		{
			rev +=s.charAt(i);
		}
		for(int i=0;i<s.length()-(n);i++) 
		{ 
			rev +=s.charAt(i); 
		}
		
		System.out.println(rev);
		
		
	}

}
