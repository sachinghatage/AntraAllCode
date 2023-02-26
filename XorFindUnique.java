
public class XorFindUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,1,2,3,3,4,4};
		int no=0;
		for(int i=0;i<a.length;i++) {
			no=no^a[i];
		}
		System.out.println(no);
	}

}
