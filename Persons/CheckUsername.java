package WorkFlow_OOP.Persons;
import WorkFlow_OOP.Enums.SellerOrClient;

import java.util.*;

public class CheckUsername{
    static Map<String, SellerOrClient> usernames = new HashMap<>();
    public static boolean checkUsername(String username){
        return usernames.containsKey(username);
    }
    public static void addUsername(String username, SellerOrClient sellerOrClient) {
        usernames.put(username, sellerOrClient);
    }
    public static void removeUsername(String username){
        usernames.remove(username);
    }
}
