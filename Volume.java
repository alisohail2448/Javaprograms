public class Volume {

    int length, breadth, height;
    float radius, height2;
    float pi = 3.14f;

    void volume(int l, int b, int h) {

        length = l;
        breadth = b;
        height = h;
        int volumeOfCube = length * breadth * height;
        System.out.println("Volume of cube is " + volumeOfCube);

    }

    void volume(float r, float h) {

        height2 = h;
        radius = r;
        float volumeOfCyl = pi * radius * radius * height2;
        System.out.println("Volume of Cylinder is " + volumeOfCyl);

    }

    public static void main(String args[]) {

        Volume obj = new Volume();
        obj.volume(3, 3, 5);
        obj.volume(1.3f, 1.5f);

    }
}
