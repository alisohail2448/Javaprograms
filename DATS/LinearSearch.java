//LINEAR SEARCH : Index wise check the number
class LinearSearch {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int item = 4;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.println("Item is Present at " + i + " index position");
            }
        }

    }

}
