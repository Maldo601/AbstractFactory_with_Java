package com.example.demo.Mesillas;

public class MesillaEstandard implements MesillaInterface
{

    @Override
    public int numeroPatas() {
        return 0;
    }

    @Override
    public String color() {
        return "Orange";
    }

    /**
     *
     */
    @Override
    public void paint() {
        System.out.println("Creada una MesillaEstandard.");
    }
}
