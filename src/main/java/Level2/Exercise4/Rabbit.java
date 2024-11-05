package Level2.Exercise4;

public class Rabbit implements Animal{
    String name;

    public Rabbit(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Rabbit " + name + " is eating");
    }
}
