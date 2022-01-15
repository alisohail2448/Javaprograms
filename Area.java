public class Area {
    float pi = 3.14f;
    float radius = 5f;

    void area_circle(){
        
        float area_circle;
        area_circle = pi*radius*radius;
        System.out.println("Area of circle is : "+(area_circle));

    }
    public static void main(String args[]) {

        Area obj = new Area();
        obj.area_circle();
        
    }
    
}
