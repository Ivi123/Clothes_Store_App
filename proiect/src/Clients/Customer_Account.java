package Clients;

import Service.Serviciu;

import java.util.Scanner;

public class Customer_Account implements Serviciu {
    protected String first_name, last_name;
    protected int age;
    private String username, password;

    public Customer_Account() {
    }

    public Customer_Account(String first_name, String last_name, int age, String username, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override

    public void create_account(){

        Scanner acc = new Scanner(System.in);
        Customer_Account[] accounts = new Customer_Account[10];

        String first_name, last_name, username, password;
        int age;

        for (int i = 0; i < accounts.length; i++) {
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
}
