package WorkFlow_OOP.impl;

import WorkFlow_OOP.Enums.TypeOfCar;
import WorkFlow_OOP.Persons.Seller.Seller;

public interface CarsInterface {
    String getCarName();
    String getCompany();
    String getAddress();
    void setAddress(String address);
    TypeOfCar getTypeOfCar();
    Seller getSellerUsername();
    int getPrice();
    void setPrice(int price);
    int getYear();
    double getEngineCapacity();
    String getColor();
    void setColor(String color);
    int getMileAge();
}
