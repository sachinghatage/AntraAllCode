package day2;

public class MaxMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int sum=0;
		int[] a= {1,-2,6,9,4,3,8};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(max<a[i])
				max=a[i];
			else if(min>a[i])
				min=a[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println("sum="+(min+max));
	}

}
