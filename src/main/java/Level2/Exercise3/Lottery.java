package Level2.Exercise3;

public class Lottery {
    private int[] numbers;

    public Lottery(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getNumberAtPosition(int position) {
        if (position < 0 || position >= numbers.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid position: " + position);
        }
        return numbers[position];
    }
}