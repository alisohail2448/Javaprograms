abstract class Animal3 {
    String species;
    String name;

    Animal3(String s, String n) {
        species = s;
        name = n;

    }

    void eat(String food) {
        System.out.println(species + " " + name + " like have to " + food);
    }

    abstract void sound();

}