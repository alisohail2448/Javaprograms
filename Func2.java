public class Func2 {

    int a = 14;
    int b = 15;

    int sum(){
        int c;
        c = a+b;
        return c;

    }
    void mul(int x, int y){
         a = x;
         b = y;
         int m;
         m = a*b;
         System.out.println("The mul is "+m);

        
    }
    public static void main(String args[]) {

        Func2 obj = new Func2();
        System.out.println("The sum of = "+obj.sum());
        obj.mul(10, 14);

        
    }
    
}
