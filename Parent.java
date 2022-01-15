public abstract class Parent {
    String name;
    String species;

    Parent(String n, String s) {
        name = n;
        species = s;
    }

    void eat(String food) {
        System.out.println(name + " " + species + " like have to " + food);

    }

    abstract void sound();
}
