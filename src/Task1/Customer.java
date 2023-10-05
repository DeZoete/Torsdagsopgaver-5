package Task1;

import java.util.ArrayList;

public class Customer {

    private String firstName;
   private  String lastName;
    private String username;
   private  int id;
    public Customer(String firstName,String lastName, String username) {
        this.firstName = firstName;
        this.username = username;
        this.lastName = lastName;


    }
 public String toString(){

    return "Name: " + firstName + " "+lastName+"username:  " + username;
    }
    public String getFirstName(){
        return firstName;

    }
    public String getLastName(){
        return lastName;

    }
    public String getUsername(){
        return username;

    }
}
