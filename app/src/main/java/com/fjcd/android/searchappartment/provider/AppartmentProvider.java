package com.fjcd.android.searchappartment.provider;

import com.fjcd.android.searchappartment.model.Appartment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fernando on 12/13/2017.
 */

public class AppartmentProvider {

    public static List<Appartment> getAppartments(){
        Appartment appartmentOne = new Appartment();
        appartmentOne.setId(1);
        appartmentOne.setDescription("Departamento en la Del Valle, 3 habitaciones");

        Appartment appartmentTwo = new Appartment();
        appartmentTwo.setId(2);
        appartmentTwo.setDescription("Departamento Anahuac, 2 habitaciones");

        List<Appartment> apparments = new ArrayList<Appartment>();
        apparments.add(appartmentOne);
        apparments.add(appartmentTwo);

        return apparments;
    }
}
