package WorkFlow_OOP.Persons;

import WorkFlow_OOP.Exception.WrongMessageException;
import WorkFlow_OOP.Persons.Client.Client;
import WorkFlow_OOP.Persons.Seller.Seller;
import WorkFlow_OOP.Enums.SellerOrClient;
import WorkFlow_OOP.impl.CreatePersons;

public class PersonsFactory {
    public CreatePersons createPersons(String username, String name, String surname, int age, String address, String email, SellerOrClient sellerOrClient) throws WrongMessageException {
        switch(sellerOrClient){
            case SELLER:  return new Seller(username, name,surname, age, address, email, SellerOrClient.SELLER);
            case CLIENT:  return new Client(username, name,surname, age, address, email, SellerOrClient.CLIENT);
            default: return null;
        }
    }
}
