package javamaven;

import TypesOfCar.PremiumCarType;

import java.util.Arrays;
import java.util.List;

public class Runner {

    //getting the list view

    static List<Car> cars = Arrays.asList(

            new EconomyCar("TOYOTA", 15, 150, 50, 150),
            new EconomyCar("KIA", 10, 140, 40, 140),
            new EconomyCar("OPEL", 20, 160,60, 160),
            new StandardCar("AUDI", 40, 180, 70, 170),
            new StandardCar("SUBARU", 30, 170, 65, 165),
            new StandardCar("CAMARO", 50, 185, 80, 180),
            new PremiumCar("BMW", 70, 200, 100, 190, PremiumCarType.SEDAN),
            new PremiumCar("ASTON MARTIN", 60, 190, 95, 195, PremiumCarType.COUPE),
            new PremiumCar("DODGE", 80, 220,110, 185, PremiumCarType.SPORTS)
    );

    public static void main(String[] args) {

        TaxiStation taxiStation = new TaxiStation(cars);

        System.out.println("\nTotal price of car in the Taxi Station is " + taxiStation.getTotalPriceOfCars()+"\n");
        System.out.println("Sorting cars by fuel consumption: \n" + taxiStation.getSortByFuelConsumptionOfCar().toString()+"\n");
        System.out.print("Find car by parameters of speed. Input car's speed: ");
        System.out.println(taxiStation.getCarByParameterOfSpeedInDiapason());
    }
}
