package com.example.pruebas_unitarias.impl;

import com.example.pruebas_unitarias.services.ServicioAbstracto;
import com.example.pruebas_unitarias.services.ServicioB;

public class ServicioBImpl implements ServicioB {

    private ServicioAbstracto servicioA;

    @Override
    public ServicioAbstracto getServicioA(ServicioAbstracto servicioA) {
        this.servicioA = servicioA;
        return this.servicioA;
    }

    @Override
    public int multiplicarSumar(int a, int b, int multiplicador) {
        return this.servicioA.sumar(a, b)*multiplicador;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }

}
