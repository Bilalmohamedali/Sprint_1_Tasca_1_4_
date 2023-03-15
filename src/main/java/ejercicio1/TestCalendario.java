package ejercicio1;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalendario {

    private final Calendario calendario = new Calendario();

    @Test
    void posiciones(){
        assertTrue(calendario.meses.size()==12);
    }

    @Test
    void notNull(){
        assertNotNull(calendario.meses);
    }

    @Test
    void agostoPosicion(){
        assertTrue(calendario.meses.get(7)=="Agosto");
    }
}
