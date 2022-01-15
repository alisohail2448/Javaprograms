class Son extends Parent {

    Son() {
        super("Sam", "Human");
    }

    void sound() {
        System.out.println("Human VOice");
    }

    public static void main(String args[]) {
        Son obj = new Son();
        obj.sound();
        obj.eat("Biryani");
    }
}
