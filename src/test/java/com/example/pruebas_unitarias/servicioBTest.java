package com.example.pruebas_unitarias;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

import com.example.pruebas_unitarias.impl.ServicioAbstractoImpl;
import com.example.pruebas_unitarias.impl.ServicioBImpl;
import com.example.pruebas_unitarias.services.ServicioB;
import com.example.pruebas_unitarias.services.ServicioAbstracto;

public class servicioBTest {

    @Test
    public void testMultiplicarSumar() {
        // Aquí irían las pruebas unitarias para el método multiplicarSumar
        ServicioB servicioB = new ServicioBImpl();
        servicioB.getServicioA(new ServicioAbstractoImpl());

        assertEquals(16, servicioB.multiplicarSumar(2, 2, 4));
    }

    @Test
    public void testMultiplicarSumarMockito() {
        // Aquí irían las pruebas unitarias para el método multiplicarSumar usando Mockito
        ServicioAbstracto servicioA = Mockito.mock(ServicioAbstractoImpl.class);
        Mockito.when(servicioA.sumar(2, 2)).thenReturn(4);

        ServicioB servicioB = new ServicioBImpl();
        servicioB.getServicioA(servicioA);
        assertEquals(16, servicioB.multiplicarSumar(2, 2, 4));
    }
}
