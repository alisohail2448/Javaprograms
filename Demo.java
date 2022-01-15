class Demo implements Interface{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public static void main(String args[]) {
        Demo obj = new Demo();
        System.out.println("Addition is :"+obj.add(10, 15));
        System.out.println("Subtraction is :"+obj.sub(10, 15));
        System.out.println("Multiplication is :"+obj.mul(10, 15));
        System.out.println("Division is :"+obj.div(10, 15));
        
    }
}