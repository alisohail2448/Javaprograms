class Lion extends Animal3 {

    Lion() {
        super("Lion", "Asiatic");

    }

    void sound() {
        System.out.println("lion ROar...");

    }

    public static void main(String args[]) {
        Lion obj = new Lion();
        obj.eat("flesh");
        obj.sound();
    }
}