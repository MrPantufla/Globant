package Services;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorServiceTest {
    
    public DiscountCalculatorServiceTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void DescuentoCorrecto(){
        DiscountCalculatorService d = new DiscountCalculatorService();
        d.crearOferta(200,10);
        assertEquals(180,d.realizarDescuento());
        d.crearOferta(100,20);
        assertEquals(80, d.realizarDescuento());
        System.out.println(d.realizarDescuento());
    }
    
}
