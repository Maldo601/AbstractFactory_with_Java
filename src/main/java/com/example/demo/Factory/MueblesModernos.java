package com.example.demo.Factory;

import com.example.demo.Mesillas.MesillaInterface;
import com.example.demo.Mesillas.MesillaModerna;
import com.example.demo.Sillas.SillaInterface;
import com.example.demo.Sillas.SillaModerna;
import com.example.demo.Sofas.SofaInterface;
import com.example.demo.Sofas.SofaModerno;

public class MueblesModernos implements MueblesFactory
{
    @Override
    public SillaInterface createSilla()
    {
        return new SillaModerna();
    }
    @Override
    public MesillaInterface createMesilla()
    {
        return new MesillaModerna();
    }
    @Override
    public SofaInterface createSofa()
    {
        return new SofaModerno();
    }
}
