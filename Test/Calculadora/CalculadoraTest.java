package Calculadora;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

        @Before
        @Test
        public void sumaTest(){
            Calculadora calculadora = new Calculadora(3,4);
            assertEquals(7, calculadora.suma());
        }
        @Test
        public void restaTest(){
            Calculadora calculadora = new Calculadora(12,5);
        assertEquals(7, calculadora.rest());
         }
    @Test
    public void multiTest(){
        Calculadora calculadora = new Calculadora(12,5);
        assertEquals(60, calculadora.multiplicacion());
    }
    @Test
    public void divisionTest(){
        Calculadora calculadora = new Calculadora(120,2);
        assertEquals(60, calculadora.division());
    }

}