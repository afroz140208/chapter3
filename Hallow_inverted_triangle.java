package ch3;

public class Hallow_inverted_triangle {

	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				if(i==n||j==1||j==i) {
				System.out.print("*");
				}else {
					System.out.print(" ");
					
				}
				
			}
			System.out.println();
		}

	}

}
