public class Circle {
    float radius = 5.0f;
    float pi = 3.14f;

    void circum(){
        float c;
        c = pi * radius * radius;
        System.out.println("Circumference of circle : "+c);
    }
    public static void main(String args[]) {
        Circle obj = new Circle();
        obj.circum();
        
    }

    
}
