package Level1.Exercise3;

public class Fruit {
    private String[] fruits = {"Apple", "Banana", "Strawberry"};

    public String getFruitAtIndex(int index) {
        if (index < 0 || index >= fruits.length) { throw new ArrayIndexOutOfBoundsException("Invalid index: " + index); } return fruits[index];
    }
}
