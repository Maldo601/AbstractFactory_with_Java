package com.example.demo.Builders;

import com.example.demo.Factory.MueblesFactory;
import com.example.demo.Mesillas.MesillaInterface;

public class BuildMesilla
{
    private final MesillaInterface mesilla;
    public BuildMesilla(MueblesFactory mueblesFactory )
    {
        mesilla  = mueblesFactory.createMesilla();
    }
    public void print()
    {
        mesilla.paint();
        System.out.println("Tiene " + mesilla.numeroPatas() + " patas.");
        System.out.println("Color: " + mesilla.color());
    }
}
