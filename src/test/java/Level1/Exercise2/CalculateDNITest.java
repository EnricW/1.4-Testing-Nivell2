package Level1.Exercise2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculateDNITest {
    @ParameterizedTest
    @CsvSource({
            "47763622, M",
            "87654321, X",
            "11111111, H",
            "22222222, J",
            "33333333, P",
            "12341234, D",
            "87654321, X",
            "31423142, J",
            "11118888, K",
            "88888888, Y"
    })
    void TestCalculateLetter(int dniNumber, char expectedLetter) {
        assertEquals(expectedLetter, CalculateDNI.calculateLetter(dniNumber),
                "Invalid letter for DNI: " + dniNumber);
    }
}