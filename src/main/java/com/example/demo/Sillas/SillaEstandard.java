package com.example.demo.Sillas;

public class SillaEstandard implements SillaInterface
{
    @Override
    public int numeroPatas()
    {
        return 0;
    }
    @Override
    public String color() {return "rojo";}
    @Override
    public void paint() {
        System.out.println("Creada una SillaEstandard.");
    }
}
