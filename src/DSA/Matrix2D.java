
public class Matrix2D {

	
	public static int m1() {
		// TODO Auto-generated method stub
		
		int[][] a= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		int max=0;
		for(int j=0;j<a[0].length;j++) {
			 int sum=0;

			for(int i=0;i<a.length;i++) {
				sum=sum+a[i][j];
			   
			}
			if(max<sum) max=sum;

		}
		return max;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println(Matrix2D.m1());
		
		  
	
	}

		

}
