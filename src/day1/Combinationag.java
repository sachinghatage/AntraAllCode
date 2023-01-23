
public class Combinationag {
     
			public static void main(String[] args) {
				
				  int count=0;
					char[] c= {'a','b','e','g','a','g'};
					for(int i=0;i<c.length;i++) {
						for(int j=1;j<c.length;j++) {
							if(c[i]=='a'&& c[j]=='g'&&i<j) 
							{
								count++;
			                 }
							
		
	                                  }
					}
					System.out.println(count);
}
}