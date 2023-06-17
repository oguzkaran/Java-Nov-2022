package com.emrekantarci;

import com.alicankececi.rental.vehicle.*;

import java.util.Random;

public class VehicleFactory {
    private final Random m_random = new Random();

    private Car createCar()
    {
        Car car = new Car();

        car.setId("123456");
        car.setModel("Focus");
        car.setYear(2022);
        car.setBrand("Ford");
        car.setType("Sedan");
        car.setPlate("34 XXX 1234");
        car.setCc(1600);

        return car;
    }

    private Truck createTruck()
    {
        Truck truck = new Truck();

        truck.setId("1234567");
        truck.setModel("XXX");
        truck.setYear(2022);
        truck.setBrand("Setra");
        truck.setPlate("34 YYY 234");
        truck.setCc(60000);
        truck.setLength(20);
        truck.setMaxCapacity(10);

        return truck;
    }
    private Bus createBus()
    {
        Bus bus = new Bus();

        bus.setId("1234565");
        bus.setModel("Tourismo");
        bus.setYear(2022);
        bus.setBrand("Mercedes");
        bus.setPlate("34 ZZZ 123");
        bus.setCc(40000);
        bus.setLength(13.3);
        bus.setPassengerCount(40);

        return bus;
    }

    private Taxi createTaxi()
    {
        Taxi taxi = new Taxi();

        taxi.setId("12345658");
        taxi.setModel("Linea");
        taxi.setYear(2022);
        taxi.setBrand("Fiat");
        taxi.setPlate("34 TTT 12");
        taxi.setCc(1600);
        taxi.setCity("istanbul");

        return taxi;
    }

    public Vehicle createVehicle()
    {
        return switch (m_random.nextInt(4)) {
            case 0 -> createCar();
            case 1 -> createBus();
            case 2 -> createTaxi();
            default -> createTruck();
        };
    }

}
