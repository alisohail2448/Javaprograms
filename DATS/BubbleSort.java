package DATS;
//BUBBLE SORT
class BubbleSort {
    public static void main(String args[]) {

        int[] a = { 36, 5, 78, 4, 7, 8 };
        int temp;
        for (int i = 0; i < a.length; i++) {

            int flag = 0;                                   
            for (int j = 0; j < a.length - 1 - i; j++) {   //a.length-1 is use for decrese the number after comparison

                if (a[j] > a[j + 1]) {                          //check the respective element
                    
                    temp = a[j];                                //SWAPING
                    a[j] = a[j + 1];                            //SWAPING
                    a[j + 1] = temp;                            //SWAPING
                    flag = 1;                                   
                }
            }
            if (flag == 0) {                                    //for stop comparing after sorting array
                break;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

    }

}
