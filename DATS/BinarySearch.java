//BINARY SEARCH OPERATE ON SORTED ARRAY
class BinarySearch {

    public static void main(String args[]) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int search = 4;
        int li = 0; // li = Lowest index
        int hi = a.length - 1; // hi = Highest index
        int mi = (li + hi) / 2; // mi = Middle index

        while (li <= hi) {

            if (a[mi] == search) { // if middle index no == search no
                System.out.println("Element is at Present " + mi + " index position");
                break;
            } else if (a[mi] < search) { // if middle index no is < search no
                li = mi + 1;
            } else { // if middle index no is > search no
                hi = mi - 1;
            }
            mi = (li + hi) / 2; // again check middle east no
        }
        if (li > mi) {
            System.out.println("Element is not found");
        }

    }

}
