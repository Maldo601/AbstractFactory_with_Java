package com.example.demo.Builders;

import com.example.demo.Factory.MueblesFactory;
import com.example.demo.Sillas.SillaInterface;

public class BuildSilla
{
    private final SillaInterface silla;

    public BuildSilla(MueblesFactory mueblesFactory )
    {
        silla  = mueblesFactory.createSilla();
    }

    public void print()
    {
        silla.paint();
        System.out.println("Tiene " + silla.numeroPatas() + " patas.");
        System.out.println("Color: " + silla.color());
    }
}
