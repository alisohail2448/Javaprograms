//LARGEST NUMBER WITH INDEX 
class Largest_with_index {
    public static void main(String args[]) {
        int[] arr = {1,5,6,76,8,9,5};
        int k = 0;
        int max = arr[0];
        int loc = 0;

        while(k <= arr.length-1){       //LENTH-1 DUE TO    INDEX = LENGTH-1
            if(max<arr[k]){
                loc = k;
                max = arr[k];
            }
            k = k+1;
           
        }
        System.out.println(max);
        System.out.println(loc);
    }
}
