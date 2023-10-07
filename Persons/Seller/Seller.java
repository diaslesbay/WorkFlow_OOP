package WorkFlow_OOP.Persons.Seller;

import WorkFlow_OOP.Exception.WrongMessageException;
import WorkFlow_OOP.Enums.SellerOrClient;
import WorkFlow_OOP.Persons.CheckUsername;
import WorkFlow_OOP.impl.CarsInterface;
import WorkFlow_OOP.impl.CreatePersons;

import java.time.Instant;
import java.util.*;

public class Seller extends CheckUsername implements CreatePersons{
    private String username;
    private String name;
    private String surname;
    private int age;
    private String address;
    private String email;
    private final String dateEntered;
    private SellerOrClient degree;
    private int account_bill;
    public List<CarsInterface> cars;

    public Seller(String username, String name, String surname, int age, String address, String email, SellerOrClient degree) throws WrongMessageException {
        if (checkUsername(username)) throw new WrongMessageException("Wrong username! Username already exists");
        this.username = username;
        addUsername(username, degree);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.email = email;
        this.degree = degree;
        dateEntered = Date.from(Instant.ofEpochSecond(System.currentTimeMillis())).toString();
        account_bill = 0;
        cars = new ArrayList<>();
    }
    public SellerOrClient getDegree(){return degree;}

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public synchronized void setUsername(String username) throws WrongMessageException {
        if(checkUsername(username)) throw new WrongMessageException("Wrong username! Username already exists");
        removeUsername(this.username);
        this.username = username;
        addUsername(username, degree);
    }

    @Override
    public int getAge() {
        return age;
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
    public String getEmail() {
        return email;
    }
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String getDateEntered() {
        return dateEntered;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public synchronized int getBills() {
        return account_bill;
    }
    public synchronized void addBills(int account_bill){
        this.account_bill += account_bill;
    }

}
