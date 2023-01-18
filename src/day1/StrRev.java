package day1;

public class StrRev {

	public static void main(String[] args) {
		int[] no = {1,2,3,4,5};
		int s=0;
		int e=no.length-1;
		while(s<e){
			int temp=no[s];
			no[s]=no[e];
			no[e]=temp;
			s++;e--;
		}
		for(int i:no){
			System.out.print(i);
		}
	}

}
