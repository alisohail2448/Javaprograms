public class StaticArea {

    static int area;

    static int cal_area(int length, int breadth, int height) {

        area = length * height * breadth;
        return area;

    }

    public static void main(String args[]) {
        System.out.println("Area is " + StaticArea.cal_area(10, 12, 14));

    }

}
