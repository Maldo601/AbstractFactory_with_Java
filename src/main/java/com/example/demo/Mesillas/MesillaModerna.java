package com.example.demo.Mesillas;

public class MesillaModerna implements MesillaInterface
{
    @Override
    public int numeroPatas() {
        return 0;
    }
    @Override
    public String color() {
        return null;
    }
    @Override
    public void paint() {
        System.out.println("Creada una MesillaModerna.");
    }
}
