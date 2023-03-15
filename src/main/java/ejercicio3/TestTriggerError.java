package ejercicio3;

import jdk.jfr.Name;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTriggerError {

    @Test
    @Name("index out of bounds by asking a higher number than list size")
    void triggerError(){
        assertThrows(ArrayIndexOutOfBoundsException.class,()-> TriggerError.triggerError());
    }
}
