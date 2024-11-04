package Level1.Exercise2;

public class calculateDNI {
    private static final char[] DNI_LETTERS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public static char calculateLetter(int dniNumber) {
        int index = dniNumber % 23;
        return DNI_LETTERS[index];
    }

    public static void main(String[] args) {
        int dniNumber = 47763622;
        char letter = calculateLetter(dniNumber);
        System.out.println("DNI is: " + dniNumber + letter);
    }
}
