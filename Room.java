public class Room {

    int length, breadth, height;
    float radius, height2;
    float pi = 3.14f;

    Room(int l, int b, int h) {

        length = l;
        breadth = b;
        height = h;

    }

    Room(float r, float h) {

        radius = r;
        height2 = h;

    }

    int volume1() {
        int v;
        v = length * breadth * height;
        return v;
    }

    float volume2() {
        float v;
        v = pi * radius * radius * height2;
        return v;
    }

    public static void main(String args[]) {
        Room obj1 = new Room(10, 12, 14);
        System.out.println("Volume of Room is " + obj1.volume1());
        Room obj2 = new Room(2.5f, 4.4f);
        System.out.println("Volume of Room is " + obj2.volume2());

    }

}
