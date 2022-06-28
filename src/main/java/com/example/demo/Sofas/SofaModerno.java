package com.example.demo.Sofas;

public class SofaModerno implements SofaInterface
{
    @Override
    public int comodidad() {
        return 5;
    }
    @Override
    public int espacios() {
        return 3;
    }
    @Override
    public void paint() {
        System.out.println("Creado un SofaModerno.");
    }
}
