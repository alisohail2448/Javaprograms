class Patterns {
    public static void main(String args[]) {
        int n = 4;

        // Upper HALF

        // 1st part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            int spaces = 2 * (n - 1);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
