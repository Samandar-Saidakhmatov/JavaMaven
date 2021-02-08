package javamaven;

import TypesOfCar.PremiumCarType;

import java.util.Objects;

public class PremiumCar extends Car{

    private PremiumCarType typeOfCar;

    public PremiumCar(String modelOfCar, int minSpeedOfCar, int maxSpeedOfCar, int priceOfCar, int fuelConsumptionOfCar, PremiumCarType typeOfCar) {
        super(modelOfCar, minSpeedOfCar, maxSpeedOfCar, priceOfCar, fuelConsumptionOfCar);
        this.typeOfCar = typeOfCar;
    }

    public PremiumCarType getTypeOfCar() {
        return typeOfCar;
    }



    @Override
    public String toString() {
        return super.toString().replace("}", "typeOfCar=" + typeOfCar+'}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PremiumCar that = (PremiumCar) o;
        return typeOfCar == that.typeOfCar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfCar);
    }
}
