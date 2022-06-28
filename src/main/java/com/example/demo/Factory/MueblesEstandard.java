package com.example.demo.Factory;

// Import de interficies. Perdida de intedidad. Abstracto implicitamente.
import com.example.demo.Sillas.SillaInterface;
import com.example.demo.Mesillas.MesillaInterface;
import com.example.demo.Sofas.SofaInterface;

// Imports de classes concretas, que tienen identidad.
import com.example.demo.Mesillas.MesillaEstandard;
import com.example.demo.Sillas.SillaEstandard;
import com.example.demo.Sofas.SofaEstandard;


public class MueblesEstandard implements MueblesFactory
{
    @Override
    public SillaInterface   createSilla()   { return new SillaEstandard();   }
    @Override
    public MesillaInterface createMesilla() { return new MesillaEstandard(); }
    @Override
    public SofaInterface    createSofa()    { return new SofaEstandard();    }
}
