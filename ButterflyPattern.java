package PatternExample;

public class ButterflyPattern {

	public static void main(String[] args) {
		//part 1 upper part of the butterfly pattern
		int rows=5;
		for(int i=1;i <= rows;i++) {//outer loop
			//inner loop1:print the stars for left wing
			for(int j=1; j <=i; j++) {
				System.out.print("* ");
				}
			
			//inner for loop2:
			int spaces=2*(rows-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print("  ");
			}
			//inner for loop3:
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			
		}
		
        System.out.println();
		}
        
        //lower part of the butterfly
        for(int i=rows;i>=1;i--) {
        	//inner for loop 1 print starts as left wing in bottom part
        	for(int j=1;j<=i;j++) {
        		System.out.print("* ");
        	}
        	int spaces = 2*(rows-i);
        	for (int j=1;j<=spaces;j++) {
        		System.out.print("  ");
        	}
        	for(int j=1;j<=i;j++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        
	}

}
