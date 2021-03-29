package Service;

import Clients.Customer_Account;
import Products.Men_Clothes;
import Products.Women_Clothes;

import java.util.Scanner;

public interface Serviciu {

    default void create_account(){

        Scanner acc = new Scanner(System.in);
        Customer_Account[] accounts = new Customer_Account[10];

        String first_name, last_name, username, password;
        int age;

        for(int i = 0; i < accounts.length; i++)
        {
            System.out.println("Introduceti numele: ");
            accounts[i] = new Customer_Account();
            first_name = acc.next();
            accounts[i].setFirst_name(first_name);

            System.out.println("Introduceti prenumele: ");
            last_name = acc.next();
            accounts[i].setLast_name(last_name);

            System.out.println("Introduceti varsta: ");
            age = acc.nextInt();
            accounts[i].setAge(age);

            System.out.println("Introduceti username-ul dorit: ");
            username = acc.next();
            accounts[i].setUsername(username);

            System.out.println("Introduceti parola: ");
            password = acc.next();
            accounts[i].setPassword(password);


        }

    }

    default void AddProductW(){
        Scanner add = new Scanner(System.in);
            Women_Clothes[] insert = new Women_Clothes[10];

        String name, category, color, fabric;
        double price;
        int code = 0;

        for(int i = 0; i < insert.length; i++)
        {
            System.out.println("Introduceti numele: ");
            insert[i] = new Women_Clothes();
            name = add.next();
            insert[i].setName(name);

            System.out.println("Introduceti categoria: ");
            category = add.next();
            insert[i].setCategory(category);

            System.out.println("Introduceti culoarea: ");
            color = add.next();
            insert[i].setColor(color);

            System.out.println("Introduceti materialul: ");
            fabric = add.next();
            insert[i].setFabric(fabric);

            System.out.println("Introduceti pretul: ");
            price = add.nextDouble();
            insert[i].setPrice(price);

            insert[i].setCode(i);

        }
    }

    default void AddProductM(){
        Scanner add = new Scanner(System.in);
        Men_Clothes[] insert = new Men_Clothes[10];

        String name, category, color, fabric;
        double price;
        int code = 0;

        for(int i = 0; i < insert.length; i++)
        {
            System.out.println("Introduceti numele: ");
            insert[i] = new Men_Clothes();
            name = add.next();
            insert[i].setName(name);

            System.out.println("Introduceti categoria: ");
            category = add.next();
            insert[i].setCategory(category);

            System.out.println("Introduceti culoarea: ");
            color = add.next();
            insert[i].setColor(color);

            System.out.println("Introduceti materialul: ");
            fabric = add.next();
            insert[i].setFabric(fabric);

            System.out.println("Introduceti pretul: ");
            price = add.nextDouble();
            insert[i].setPrice(price);

            insert[i].setCode(i);

        }
    }
}
