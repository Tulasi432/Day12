package PatternExample;

public class DiamondPattern {

	public static void main(String[] args) {
		int rows=5;
		//upper part of diamond
		for(int i=1;i<=rows;i++) {
			//inner loop 1 print leading spaces
			for(int j=1;j<=rows-i;j++){
				System.out.print("  ");
				
			}
			//inner for loop 2 
			for(int k=1;k<=2*i-1;k++){//2*i-1//1
				System.out.print("* ");
			}
			System.out.println();
		}
//lower part of the diamond pattern
		for(int i=rows-1;i>=1;i--) {
		for(int j=1;j<=rows-i;j++) {
			System.out.print("  ");
		}
		for (int k= 1;k<=2*i-1;k++) {
			System.out.print("* ");
		}
		System.out.println();
	}

}
}
