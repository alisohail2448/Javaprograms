public class Funct {
    
    int a = 25;
    int b = 35;

    int sum(){
        int c;
        c = a+b;
        return c;

    }
    void mul(int x,int y){
        int m;
        m = x*y;
        System.out.println("The multiplication is "+m);
    }
    public static void main(String args[]) {
        Funct obj1 = new Funct();
        Funct obj2 = new Funct();

        obj1.mul(5,6);
        System.out.println("Sum is "+obj2.sum());


        
    }
    
}
