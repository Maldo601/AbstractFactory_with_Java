package com.example.demo.Sofas;

public class SofaEstandard implements SofaInterface {

    @Override
    public int comodidad() {
        return 0;
    }
    @Override
    public int espacios() {
        return 0;
    }
    @Override
    public void paint() {
        System.out.println("Creado un SofaEstandard.");
    }

}
