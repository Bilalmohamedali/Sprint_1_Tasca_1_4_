package ejercicio2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculoDni {

    static Stream<Arguments> dniData() {
        return Stream.of(
                Arguments.of(39378289, "N"),
                Arguments.of(12345678, "Z"),
                Arguments.of(91234567, "F"),
                Arguments.of(89123456, "C"),
                Arguments.of(78912345, "N"),
                Arguments.of(67891234, "H"),
                Arguments.of(56789123, "F"),
                Arguments.of(45678912, "S"),
                Arguments.of(34567891, "H"),
                Arguments.of(23456789, "D")
        );
    }

    @ParameterizedTest
    @MethodSource("dniData")
    void letrasCorrectas(int dniNumber, String expectedLetra) {
        CalculoDni dni = new CalculoDni(dniNumber);
        assertEquals(expectedLetra, dni.getLetra());
    }
}
