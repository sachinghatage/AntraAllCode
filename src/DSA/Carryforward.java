package day1;

public class Carryforward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] c= {'a','b','e','g','a','g'};
		int count_a=0;
		int ans=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a')
				count_a++;
			if(c[i]=='g')
				ans=ans+count_a;
		}
		System.out.println(ans);
	}

}
