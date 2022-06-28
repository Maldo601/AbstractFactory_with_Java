package com.example.demo.App;

import com.example.demo.Builders.BuildSofa;
import com.example.demo.Factory.MueblesEstandard;
import com.example.demo.Factory.MueblesFactory;
import com.example.demo.Factory.MueblesModernos;

public class Sofa
{
    public static BuildSofa buildSofa(String type)
    {
        MueblesFactory mf = null;
        BuildSofa app;

        if(type.equals("MODERN")) mf = new MueblesModernos();
        else if (type.equals("STANDARD")) mf = new MueblesEstandard();

        app = new BuildSofa(mf);

        return app;
    }
}
