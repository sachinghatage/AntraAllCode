package day1;

public class Rotation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,4,5,6,7,8};
		int i=0;
		int j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
	}
		 i=0;                        
		 j=2;
		 while(i<j) {
			 int temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
			 i++;
			 j--;
			 
		 }
		 
		 i=3;
		 j=a.length-1;
		 while(i<j) {
			 int temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
			 i++;
			 j--;
		 }
   for(int a1:a) {
	   System.out.print(a1);
   }
}
}
