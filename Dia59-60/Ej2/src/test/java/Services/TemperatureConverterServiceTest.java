package Services;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterServiceTest {
    
    public TemperatureConverterServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void convierteCorrectamente(){
        TemperatureConverterService t = new TemperatureConverterService();
        t.cargarDatos(18.5, "f");
        assertEquals(-7.5, t.convertirAC());
        assertEquals(265.65, t.convertirAK());
        t.cargarDatos(300, "k");
        assertEquals(80.33, t.convertirAF());
        assertEquals(26.85, t.convertirAC());
        t.cargarDatos(40, "c");
        assertEquals(313.15, t.convertirAK());
        assertEquals(104, t.convertirAF());
    }
}
