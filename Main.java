package WorkFlow_OOP;

import WorkFlow_OOP.Bills.Bills;
import WorkFlow_OOP.Bills.TypeOfPayment.Halyk;
import WorkFlow_OOP.Bills.TypeOfPayment.Kaspi;
import WorkFlow_OOP.Cars.CarSelector;
import WorkFlow_OOP.Enums.TypeOfCar;
import WorkFlow_OOP.Exception.WrongMessageException;
import WorkFlow_OOP.Persons.Client.Client;
import WorkFlow_OOP.Persons.PersonsFactory;
import WorkFlow_OOP.Enums.SellerOrClient;
import WorkFlow_OOP.Persons.Seller.Seller;
import WorkFlow_OOP.impl.CarsInterface;
import WorkFlow_OOP.impl.CreatePersons;

public class Main {
    public static void main(String[] args) throws WrongMessageException {
        /** Create clients and sellers*/
        PersonsFactory personsFactory = new PersonsFactory();
        CreatePersons client1 = personsFactory.createPersons("dias_lesbay", "Dias","Lesbay", 20, "Almaty", "lesbaydias@gmail.com", SellerOrClient.CLIENT);
        CreatePersons client2 = personsFactory.createPersons("dasha04", "Dasha","D", 20, "Almaty", "lesbaydias@gmail.com", SellerOrClient.CLIENT);
        CreatePersons seller1 = personsFactory.createPersons("sasha2012", "Sasha","S", 20, "Almaty", "lesbaydias@gmail.com", SellerOrClient.SELLER);
        CreatePersons seller2 = personsFactory.createPersons("nurzat", "Nurzat","N", 20, "Almaty", "lesbaydias@gmail.com", SellerOrClient.SELLER);

        /** Create cars */
        CarSelector carSelector = new CarSelector();
        CarsInterface Toyota = carSelector.createCar("Toyota", "Japan", "ALA", TypeOfCar.SEDAN, (Seller) seller1, 6000, 2020, 2.5, "white", 0);
        CarsInterface Mers = carSelector.createCar("Mers", "Germany", "SHYM", TypeOfCar.SUV, (Seller) seller2, 3000, 2020, 3.5, "black", 0);
        CarsInterface BMW = carSelector.createCar("BMW", "Germany", "SHYM", TypeOfCar.SUV, (Seller) seller1, 3200, 2020, 3.5, "black", 0);

        /** Show Sellers' cars (catalog of cars) */
        System.out.println("Seller 1's cars: ");
        for (int i = 0; i < ((Seller) seller1).cars.size(); i++) System.out.println(((Seller) seller1).cars.get(i).getCarName()+" - "+((Seller) seller1).cars.get(i).getPrice()+"$");
        System.out.println("Bills = "+seller1.getBills()+"$");
        System.out.println("\nSeller 2's cars: ");
        for (int i = 0; i < ((Seller) seller2).cars.size(); i++) System.out.println(((Seller) seller2).cars.get(i).getCarName()+" - "+((Seller) seller2).cars.get(i).getPrice()+"$");
        System.out.println("Bills = "+seller2.getBills()+"$");
        
        /** Create type of payments*/
        Bills kaspi = new Kaspi();
        Bills halyk = new Halyk();
        
        /**Clint1's bills is not enough that's why we added some money*/
        ((Client) client1).addBill(12000);
        
        /**Client1 bought BMW with kaspi */
        System.out.println("\n"+kaspi.calculateBills((Client) client1, BMW));

        /**Clint2's bills is not enough that's why we added some money */
        ((Client) client2).addBill(4000);

        /**Client2 bought Mers with halyk */
        System.out.println(halyk.calculateBills((Client) client2,Mers));

        /** Check clients' bills */
        System.out.println("\nClient 1's bills = "+client1.getBills()+"$");
        System.out.println("Client 2's bills = "+client2.getBills()+"$\n");

        /** Check Sellers' bills and cars (available list of cars) */
        System.out.println("Seller 1's cars: ");
        for (int i = 0; i < ((Seller) seller1).cars.size(); i++) System.out.println(((Seller) seller1).cars.get(i).getCarName()+" - "+((Seller) seller1).cars.get(i).getPrice()+"$");
        System.out.println("Bills = "+seller1.getBills()+"$");
        System.out.println("\nSeller 2's cars: ");
        for (int i = 0; i < ((Seller) seller2).cars.size(); i++) System.out.println(((Seller) seller2).cars.get(i).getCarName()+"-"+((Seller) seller2).cars.get(i).getPrice()+"$");
        System.out.println("Bills = "+seller2.getBills()+"$");
    }
}
