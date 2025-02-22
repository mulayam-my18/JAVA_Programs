package learnM;

public class NoSerease {
	/*
	 * 11111
	 * 22222
	 * 33333
	 * 44444
	 * 55555
	 * 
	 * 55555
	 * 44444
	 * 33333
	 * 22222
	 * 11111
	 */

	public static void main(String[] args) {
		
		// 11111111111111111111111111 //
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		// 22222222222222222222222 //
        
		for(int i=5;i>=1;i--) {
			
			for(int j=1;j<=5;j++) {
				
				System.out.print(i);
			}
			
			System.out.println();
		}
		

	}

}
