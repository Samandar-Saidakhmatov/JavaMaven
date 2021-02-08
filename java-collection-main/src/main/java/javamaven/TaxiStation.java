package javamaven;

import TypesOfCar.PremiumCarType;

import java.util.*;

public class TaxiStation {
    private List<? extends Car> cars;

    //cars
    public List<EconomyCar> getEconomyCar(){
        List<? extends Car> listOfCar = this.cars;
        List<EconomyCar> listOfEconomyCar = new ArrayList<>();
        for (Car car : listOfCar){
            if (car instanceof EconomyCar){
                listOfEconomyCar.add((EconomyCar)car);
            }
        }
        return listOfEconomyCar;
    }

    public List<StandardCar> getStandardCar(){
        List<StandardCar> listOfStandardCar = new ArrayList<>();
        for (Car car : cars){
            if (car instanceof StandardCar){
                listOfStandardCar.add((StandardCar) car);
            }
        }
        return listOfStandardCar;
    }

    public List<PremiumCar> getPremiumCar(){
        List<PremiumCar> listOfPremiumCar = new ArrayList<>();
        for (Car car : cars){
            if (car instanceof PremiumCar){
                listOfPremiumCar.add((PremiumCar) car);
            }
        }
        return listOfPremiumCar;
    }

    //types of Premium cars

    public List<PremiumCar> getSedanPremiumCar(){
        List<PremiumCar> listOfSedanPremiumCar = new ArrayList<>();
        List<PremiumCar> sedanPremiumCar = getPremiumCar();
        for (int i = 0; i < sedanPremiumCar.size(); i++){
            PremiumCar car = sedanPremiumCar.get(i);
            if (car.getTypeOfCar() == PremiumCarType.SEDAN){
                listOfSedanPremiumCar.add(car);
            }
        }
        return listOfSedanPremiumCar;
    }


    public List<PremiumCar> getSportsPremiumCar(){
        List<PremiumCar> listOfSportsPremiumCar = new ArrayList<>();
        List<PremiumCar> sportsPremiumCar = getPremiumCar();
        for (int i = 0; i < sportsPremiumCar.size(); i++){
            PremiumCar car = sportsPremiumCar.get(i);
            if (car.getTypeOfCar() == PremiumCarType.SPORTS){
                listOfSportsPremiumCar.add(car);
            }
        }
        return listOfSportsPremiumCar;
    }

    public List<PremiumCar> getCoupePremiumCar(){
        List<PremiumCar> listOfCoupePremiumCar = new ArrayList<>();
        List<PremiumCar> coupePremiumCar = getPremiumCar();
        for (int i = 0; i < coupePremiumCar.size(); i++){
            PremiumCar car = coupePremiumCar.get(i);
            if (car.getTypeOfCar() == PremiumCarType.COUPE){
                listOfCoupePremiumCar.add(car);
            }
        }
        return listOfCoupePremiumCar;
    }


    //sorting cars by fuel consumption

    public TaxiStation getSortByFuelConsumptionOfCar(){
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getFuelConsumptionOfCar() - o2.getFuelConsumptionOfCar();
            }
        });
        return this;
    }


    //get total prise of cars

    public double getTotalPriceOfCars(){
        double totalPrice = 0;

        for (Car car : cars){
            totalPrice += car.getPriceOfCar();
        }
        return totalPrice;
    }


    //find car by parameters of speed
    public List<Car> getCarByParameterOfSpeedInDiapason(){
        List<Car> carInDiapasonOfSpeed = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int inputCarSpeed = in.nextInt();
        for (Car car : cars){
            if((inputCarSpeed > car.getMinSpeedOfCar()) && inputCarSpeed < car.getMaxSpeedOfCar()){
                carInDiapasonOfSpeed.add(car);
            }
        }
        if (carInDiapasonOfSpeed.isEmpty()){
            System.out.println("Car's speed isn't in the diapason");
        }
        return carInDiapasonOfSpeed;
    }


    @Override
    public String toString() {
        return "TaxiStation: " + cars + "";
    }

    public TaxiStation(List<? extends Car> cars) {
        this.cars = cars;
    }
}
