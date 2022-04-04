
public class Pattern {

	public static void main(String[] args) {
		int n=3;
		for(int i=0;i<n;i++) {
			for(int k=n-i;k>0;k--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i*2 ;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
