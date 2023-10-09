package test.java.com.tuempresa;

import Calculadora.Calculadora;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {



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
    @Test
    public void mostrarInfo(){
        Package junitPackage = org.junit.Assert.class.getPackage();
        String junitVersion = junitPackage.getImplementationVersion();
        System.out.println("JUnit version: " + junitVersion);
    }
}