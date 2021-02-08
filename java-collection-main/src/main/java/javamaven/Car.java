package javamaven;

import java.util.Objects;

abstract public class Car{
    String modelOfCar;
    private int minSpeedOfCar;
    private int maxSpeedOfCar;
    private int priceOfCar;
    private int fuelConsumptionOfCar;


    public Car(String modelOfCar, int minSpeedOfCar, int maxSpeedOfCar, int priceOfCar, int fuelConsumptionOfCar){
        this.modelOfCar = modelOfCar;
        this.minSpeedOfCar = minSpeedOfCar;
        this.maxSpeedOfCar = maxSpeedOfCar;
        this.priceOfCar = priceOfCar;
        this.fuelConsumptionOfCar = fuelConsumptionOfCar;
    }

    public String getModelOfCar() { return modelOfCar; }


    public int getMinSpeedOfCar() { return minSpeedOfCar; }

    public int getMaxSpeedOfCar() {
        return maxSpeedOfCar;
    }

    public int getPriceOfCar() {
        return priceOfCar;
    }

    public int getFuelConsumptionOfCar() {
        return fuelConsumptionOfCar;
    }

    @Override
    public String toString() {
        return "ModelOfCar= '" + modelOfCar + '\'' +
                ", MinSpeedOfCar=" + minSpeedOfCar +
                ", MaxSpeedOfCar=" + maxSpeedOfCar +
                ", PriceOfCar=" + priceOfCar +
                ", FuelConsumptionOfCar=" + fuelConsumptionOfCar + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return minSpeedOfCar == car.minSpeedOfCar && maxSpeedOfCar == car.maxSpeedOfCar && priceOfCar == car.priceOfCar && fuelConsumptionOfCar == car.fuelConsumptionOfCar && Objects.equals(modelOfCar, car.modelOfCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelOfCar, minSpeedOfCar, maxSpeedOfCar, priceOfCar, fuelConsumptionOfCar);
    }

}
