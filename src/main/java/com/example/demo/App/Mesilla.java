package com.example.demo.App;

import com.example.demo.Builders.BuildMesilla;
import com.example.demo.Factory.MueblesEstandard;
import com.example.demo.Factory.MueblesFactory;
import com.example.demo.Factory.MueblesModernos;

public class Mesilla
{
    public static BuildMesilla buildMesilla(String type) {
        MueblesFactory mf = null;
        BuildMesilla app;

        if(type.equals("MODERN")) mf = new MueblesModernos();
        else if (type.equals("STANDARD")) mf = new MueblesEstandard();

        app = new BuildMesilla(mf);

        return app;
    }
}
