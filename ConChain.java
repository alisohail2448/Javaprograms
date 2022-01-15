public class ConChain {

    int length, breadth, height;

    ConChain(int length, int breadth, int height) {

        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    ConChain() {
        this(12, 10, 14);
    }

    int volume() {
        int v = length * breadth * height;
        return v;

    }

    public static void main(String args[]) {

        ConChain obj = new ConChain();
        System.out.println("The Volume is  " + obj.volume());

    }
}
