class Pyramid2 {
	public static void main(String args[]) {
		int n = 5;

		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 2; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * (n - i + 1) - 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

