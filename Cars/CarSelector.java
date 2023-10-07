package WorkFlow_OOP.Cars;

import WorkFlow_OOP.Cars.TypeOfCars.Jeep;
import WorkFlow_OOP.Cars.TypeOfCars.SUV;
import WorkFlow_OOP.Cars.TypeOfCars.Sedan;
import WorkFlow_OOP.Enums.TypeOfCar;
import WorkFlow_OOP.Exception.WrongMessageException;
import WorkFlow_OOP.Persons.Seller.Seller;
import WorkFlow_OOP.impl.CarsInterface;

public class CarSelector {
    public CarsInterface createCar(String carName, String company, String address, TypeOfCar typeOfCar, Seller username, int price, int year, double engineCapacity, String color, int mileAge) throws WrongMessageException {
        CarsInterface car = null;
        switch(typeOfCar) {
            case SEDAN -> {
                car = new Sedan(carName, company, address, typeOfCar, username, price, year, engineCapacity, color, mileAge);
                username.cars.add(car);
            }
            case SUV -> {
                car = new SUV(carName, company, address, typeOfCar, username, price, year, engineCapacity, color, mileAge);
                username.cars.add(car);
            }
            case JEEP -> {
                car = new Jeep(carName, company, address, typeOfCar, username, price, year, engineCapacity, color, mileAge);
                username.cars.add(car);
            }
        }
        return car;
    }
}
