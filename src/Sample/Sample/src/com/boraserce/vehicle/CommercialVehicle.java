package com.boraserce.vehicle;

import com.alicankececi.rental.vehicle.Vehicle;

public class CommercialVehicle extends Vehicle {
    protected boolean forPassenger;

    //

    public CommercialVehicle(boolean passenger)
    {
        forPassenger = passenger;
    }

    //...

    public double calculateTax()
    {
        return 1000;
    }
}
