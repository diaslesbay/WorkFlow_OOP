package WorkFlow_OOP.Bills;

import WorkFlow_OOP.Exception.WrongMessageException;
import WorkFlow_OOP.Persons.Client.Client;
import WorkFlow_OOP.impl.CarsInterface;

public abstract class Bills {
    public abstract String calculateBills(Client client, CarsInterface car) throws WrongMessageException;
}
