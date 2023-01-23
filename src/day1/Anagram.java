package day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] c1= {'g','r','a','m'};
		char[] c2= {'a','r','m','g'};
		
		System.out.println(areAnagram(c1,c2));
	}

	private static boolean areAnagram(char[] c1, char[] c2) {
		// TODO Auto-generated method stub
		int n1=c1.length;
		int n2=c2.length;
		
		if(n1!=n2)
			return false;
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for(int i=0;i<n1;i++) {
			if(c1[i]!=c2[i])
				return false;
						
		}
		return true;
	}

}
