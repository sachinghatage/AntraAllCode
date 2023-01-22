
public class PrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {2,3,4,5,6,7};
		int[][] b= {{1,3},{1,5}};
		int n=a.length;
		int[] pf=new int[n];
		pf[0]=a[0];
		for(int i=1;i<n;i++) {
			
			pf[i]=pf[i-1]+a[i];

		}
		
		for(int j=0;j<b.length;j++) {
			int[] q=b[j];
			int s=q[0];
			int e=q[0];
			int sum=0;
			 if(q.length>1) {
				s=q[0];
				e=q[1];
				sum=pf[e]-pf[s-1];
			}
			

			System.out.println(sum);

		}
			}
	}
		
	


