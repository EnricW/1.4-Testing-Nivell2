package Level1.Exercise3;

public class Fruit {
    private String[] fruits = {"Apple", "Banana", "Strawberry"};

    public String getFruitAtIndex(int index) {
        return fruits[index]; // Throws ArrayIndexOutOfBoundsException if the index is out of bounds
    }
}
