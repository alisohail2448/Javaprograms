//DELETION
class DeleteElement {
    public static void main(String args[]) {
        int[] a = { 10, 20, 30, 40, 50 };
        int del = 30;

        for (int i = 0; i < a.length; i++) {

            if (del == a[i]) {
                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1]; // Pull the elements after delete element
                }
                break;

            }
        }
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(a[i] + " ");
        }

    }

}
