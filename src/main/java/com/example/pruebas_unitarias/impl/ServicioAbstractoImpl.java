package com.example.pruebas_unitarias.impl;

import com.example.pruebas_unitarias.services.ServicioAbstracto;

public class ServicioAbstractoImpl implements ServicioAbstracto {

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }

}
