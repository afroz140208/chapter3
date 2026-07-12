package ch3;

public class Hour_glass {

	public static void main(String[] args) {
		int n = 5;

        // Upper half
        for (int i = n; i >= 1; i--) {

            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == n || j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Lower half
        for (int i = 2; i <= n; i++) {

            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == n || j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

