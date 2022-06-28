package com.example.demo.Builders;

import com.example.demo.Factory.MueblesFactory;
import com.example.demo.Sofas.SofaInterface;


public class BuildSofa
{
    private final SofaInterface sofa;

    public BuildSofa(MueblesFactory mueblesFactory )
    {
        sofa  = mueblesFactory.createSofa();
    }

    public void print()
    {
        sofa.paint();
        System.out.println("Tiene " + sofa.espacios() + " espacios.");
        System.out.println("Nivel de comodidad: " + sofa.comodidad());
    }
}
