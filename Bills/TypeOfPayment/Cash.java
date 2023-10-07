package WorkFlow_OOP.Bills.TypeOfPayment;

import WorkFlow_OOP.Bills.Bills;
import WorkFlow_OOP.Exception.WrongMessageException;
import WorkFlow_OOP.Persons.Client.Client;
import WorkFlow_OOP.impl.CarsInterface;

public class Cash extends Bills {
    @Override
    public synchronized String calculateBills(Client client, CarsInterface car) throws WrongMessageException {
        if(client.getBills() < car.getPrice()) throw new WrongMessageException("Not enough money!");
        car.getSellerUsername().addBills(car.getPrice());
        car.getSellerUsername().cars.remove(car);
        client.buyCars(car);
        return "Successfully payed by Cash";
    }
}
