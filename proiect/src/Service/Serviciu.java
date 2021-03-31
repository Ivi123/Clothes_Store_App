package Service;

import Clients.Customer_Account;

import java.util.Scanner;

public interface Serviciu {

    default void create_account(){
        Scanner acc = new Scanner(System.in);
        Customer_Account accounts = new Customer_Account();

        String first_name, last_name, username, password;
        int age;

        System.out.println("Creare cont nou");
        System.out.println("Introduceti numele: ");
        accounts = new Customer_Account();
        first_name = acc.next();
        accounts.setFirst_name(first_name);

        System.out.println("Introduceti prenumele: ");
        last_name = acc.next();
        accounts.setLast_name(last_name);

        System.out.println("Introduceti varsta: ");
        age = acc.nextInt();
        accounts.setAge(age);

        System.out.println("Introduceti username-ul dorit: ");
        username = acc.next();
        accounts.setUsername(username);

        System.out.println("Introduceti parola: ");
        password = acc.next();
        accounts.setPassword(password);

    }

    default void AddProductW(){};

    default void AddProductM(){};
}
