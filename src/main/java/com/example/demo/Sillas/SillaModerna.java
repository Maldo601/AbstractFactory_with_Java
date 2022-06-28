package com.example.demo.Sillas;

public class SillaModerna implements SillaInterface
{
    @Override
    public int numeroPatas()
    {
        return 2;
    }
    @Override
    public String color() {return "azul";}
    @Override
    public void paint() {
        System.out.println("Creada una SillaModerna.");
    }
}
