//INSERTION
class InsertElement {
    public static void main(String args[]) {
        int[] a ={1,2,3,4,5,6,6,};
        int pos = 4;
        int element = 200;

        for(int i = a.length-1;i>pos-1;i--){ //value Traverse from index three
            a[i] = a[i-1];   // push the value of after pos 4 
        }
        a[pos-1] = element; //store the value at 3rd index and 4th position

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        
    }
    
}
