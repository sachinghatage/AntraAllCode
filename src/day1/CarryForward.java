
public class CarryForward {

	
	
	public class A {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int[] a= {1,2,9,4,5,6};
			int[][] b= {{1,4}};
			int[] lfmax=lfmax(a,b);
			int[] rmax=rmax(a,b);
			
		for(int i:lfmax) {
				System.out.println(i);
			}
		
		for(int i:rmax) {
				System.out.println(i);
			}

		}

		private static int[] rmax(int[] a, int[][] b) {
	        int n=a.length;
			int[] rmax=new int[n];
			int[] output=new int[b.length];
			rmax[n-1]=a[n-1];
			for(int i=n-2;i>=0;i--) {
				rmax[i]=Math.max(rmax[i+1], a[i]);
			}
			
			for(int i=0;i<output.length;i++) {
				int[] js=b[i];
				int l=js[0];
				output[i]=rmax[l];
			}
			
			
			return output;
		}
		
		private static int[] lfmax(int[] a, int[][] b) {
			int[] lfmax=new int[a.length];
			int[] output=new int[b.length];
			lfmax[0]=a[0];
			for(int i=1;i<lfmax.length;i++) {
				lfmax[i]=Math.max(lfmax[i-1], a[i]);
			}
			
			for(int i=0;i<output.length;i++) {
				int[] js=b[i];
				int l=js[1];
				output[i]=lfmax[l];
			}

		   return output;
		}

	}
}
	
	
	

