class Sort {

    public static void main(String args[]) {

        int a[] = { 1, 4, 6, 3, 6, 8, 9, };

        for (int i = 0; i < a.length; i++) {
            System.out.println("Elements of aay " + a[i]);
        }

        for (int i = 0; i < a.length; i++) {

            for (int j = i+1; j < a.length; j++) {

                if (a[i] > a[j]) {
                    int temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
          for (int k = 0; k < a.length; k++) {
                System.out.println(a[k]);
            }

    }

}
