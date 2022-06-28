package com.example.demo;


import com.example.demo.Builders.BuildMesilla;
import com.example.demo.Builders.BuildSilla;
import com.example.demo.Builders.BuildSofa;

import static com.example.demo.App.Mesilla.buildMesilla;
import static com.example.demo.App.Silla.buildSilla;
import static com.example.demo.App.Sofa.buildSofa;

public class Demo
{
    static final String MODERN = "MODERN";
    static final String STANDARD = "STANDARD";

    public static void main(String[] args)
    {
        BuildMesilla mesilla = buildMesilla(STANDARD);
        BuildSilla silla = buildSilla(MODERN);
        BuildSofa sofa = buildSofa(MODERN);

        mesilla.print();

        silla.print();

        sofa.print();


    }
}
