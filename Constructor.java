public class Constructor {
    int length,breadth,height;

    Constructor(){
        length = 10;
        breadth = 10;
        height = 10;

    }
    int val(){
        int v;
        v = length*breadth*height;
        return v;

    }
    public static void main(String args[]) {
        Constructor obj = new Constructor();
        System.out.println("Volume of ROom is "+obj.val());

        
    }
    
}
