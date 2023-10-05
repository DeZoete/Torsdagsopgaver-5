package Task1;

import Task1.Customer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

         ArrayList<Customer> customers = new ArrayList<>();
//Task1.Customer c1 = new Task1.Customer("Jonas"," de Zoete","kongen");
//customers.add(c1);
customers.add(new Customer("Jonas"," de Zoete ","kongen"));
        printCustomers(customers);
    }

    static void printCustomers(ArrayList<Customer> customers){
        int sum = 0;
        for(Customer c: customers){
            System.out.println(c);

        }

    }
    }
