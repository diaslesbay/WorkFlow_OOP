package WorkFlow_OOP.impl;

import WorkFlow_OOP.Exception.WrongMessageException;
import WorkFlow_OOP.Enums.SellerOrClient;

public interface CreatePersons {
    SellerOrClient getDegree();
    String getSurname();
    void setSurname(String surname);
    String getUsername();
    void setUsername(String username) throws WrongMessageException;
    int getAge();
    String getAddress();
    void setAddress(String address);
    String getEmail() ;
    void setEmail(String email);
    String getDateEntered();
    String getName();
    void setName(String name);
    int getBills();
}
