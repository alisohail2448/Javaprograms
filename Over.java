public class Over {
    float radius;
    float pi = 3.14f;
    int length, breadth;
    int side;

    void area(float r) {
        radius = r;
        float areaOfCircle;
        areaOfCircle = pi * radius * radius;
        System.out.println("Area of circle is " + areaOfCircle);
    }

    void area(int l, int b) {
        length = l;
        breadth = b;
        int areaOfRectan;
        areaOfRectan = length * breadth;
        System.out.println("Area of Rectangle is " + areaOfRectan);
    }

    void area(int s) {
        side = s;
        int areaOfSquare;
        areaOfSquare = side * side;
        System.out.println("Area of Square is " + areaOfSquare);
    }

    public static void main(String args[]) {
        Over obj = new Over();
        obj.area(5.0f);
        obj.area(5, 5);
        obj.area(10);

    }

}
