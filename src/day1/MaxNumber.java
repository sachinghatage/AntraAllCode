
public class MaxNumber {

	int s,e;
	public void maxNumber(int[] a,int[][] b) {
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<b.length;i++) {
			
			int[]q=b[i];
			s=q[0];
			e=q[0];
			
			if(b[i].length>1) {
				e=q[1];
			
			}
			for(int j=s;j<=e;j++) {
				if(max<a[j])
					max=a[j];
			}
		
			System.out.println(max);
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {-3,6,2,4,5,2,8};
		int[][] b= {{1,5},{0,3}};
		MaxNumber m=new MaxNumber();
		m.maxNumber(a, b);
	}

}
