package WorkFlow_OOP.Cars.TypeOfCars;

import WorkFlow_OOP.Enums.TypeOfCar;
import WorkFlow_OOP.Exception.WrongMessageException;
import WorkFlow_OOP.Persons.Seller.Seller;
import WorkFlow_OOP.impl.CarsInterface;


public class SUV implements CarsInterface {
    private final String carName;
    private final String company;
    private String address;
    private final TypeOfCar typeOfCar;
    private final Seller username;
    private int price;
    private final int year;
    private final double engineCapacity;
    private String color;
    private final int mileAge;

    public SUV(String carName, String company, String address, TypeOfCar typeOfCar, Seller username, int price, int year, double engineCapacity, String color, int mileAge) throws WrongMessageException {
        this.carName = carName;
        this.company = company;
        this.address = address;
        this.typeOfCar = typeOfCar;
        this.username = username;
        this.price = price;
        this.year = year;
        this.engineCapacity = engineCapacity;
        this.color = color;
        this.mileAge = mileAge;
    }

    @Override
    public String getCarName() {
        return carName;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public TypeOfCar getTypeOfCar() {
        return typeOfCar;
    }

    @Override
    public Seller getSellerUsername() {
        return username;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getMileAge() {
        return mileAge;
    }
}
