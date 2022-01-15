//SUM AND AVERAGE
class Sum_Average {
    public static void main(String args[]) {

        int a[] = {1,2,3,4,5,6,7,8,9};
        int length = a.length;      //LENTH OF ARRAY IS SIX
        int sum = 0;
        int average = 0;
        for(int i=0;i<=a.length-1;i++){
            sum += a[i];            //SUM OF ELEMENTS
        }
        average = sum/length;
        System.out.println("The sum of given array is = "+sum);
        System.out.println("The Average of given array is = "+average);
    }
    
}
