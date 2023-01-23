package day1;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="sachin";
		char[] c=s1.toCharArray();
		int i=0;
		int j=c.length-1;
		while(i<j) {
			char temp=c[i];
			c[i]=c[j];
			c[j]=  temp;
			i++;
			j--;
			
		}
		for(char a:c) {
			System.out.print(a);
		}
	}

}
