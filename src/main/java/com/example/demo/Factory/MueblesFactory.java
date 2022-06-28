package com.example.demo.Factory;

import com.example.demo.Mesillas.MesillaInterface;
import com.example.demo.Sillas.SillaInterface;
import com.example.demo.Sofas.SofaInterface;

/**
 *
 */
public interface MueblesFactory
{
    SillaInterface createSilla();

    MesillaInterface createMesilla();

    SofaInterface createSofa();

}
