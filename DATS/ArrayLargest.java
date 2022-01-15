class ArrayLargest {
    public static void main(String args[]) {

        int[] arr = { 1, 5, 3, 596, 354, 2, 9 };

        int max = arr[0];
        for (int i = 1; i <= arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];

            }
              System.out.println("Largest Element is :" + max);
        }
      

    }

}
