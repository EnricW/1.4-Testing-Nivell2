package Level2.Exercise4;

public class Hamster implements Animal{
    private String name;

    public Hamster(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Hamster " + name + " is eating");
    }
}
