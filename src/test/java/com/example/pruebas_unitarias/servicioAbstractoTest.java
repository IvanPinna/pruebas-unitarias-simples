package com.example.pruebas_unitarias;

import org.junit.Test;

import com.example.pruebas_unitarias.impl.ServicioAbstractoImpl;

public class servicioAbstractoTest {

    @Test
    public void testSumar() {
        ServicioAbstractoImpl servicioAbstractoImpl = new ServicioAbstractoImpl();
        int a = 5;
        int b = 3;  
        int expectedSum = 8;
        int actualSum = servicioAbstractoImpl.sumar(a, b);

        assert expectedSum == actualSum : "Test failed: expected " + expectedSum + " but got " + actualSum;
    }
}
