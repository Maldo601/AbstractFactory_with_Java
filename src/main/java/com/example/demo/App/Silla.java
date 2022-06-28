package com.example.demo.App;

import com.example.demo.Factory.MueblesFactory;

import com.example.demo.Builders.BuildSilla;
import com.example.demo.Factory.MueblesEstandard;
import com.example.demo.Factory.MueblesModernos;

public class Silla
{
    public static BuildSilla buildSilla(String type) {
        MueblesFactory mf = null;
        BuildSilla app;

        if(type.equals("MODERN")) mf = new MueblesModernos();
        else if (type.equals("STANDARD")) mf = new MueblesEstandard();

        app = new BuildSilla(mf);

        return app;
    }
}
