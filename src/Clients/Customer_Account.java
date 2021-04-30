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

        System.out.println("Creare cont nou");
            System.out.println("Introduceti numele: ");
            first_name = acc.next();

            System.out.println("Introduceti prenumele: ");
            last_name = acc.next();

            System.out.println("Introduceti varsta: ");
            age = acc.nextInt();

            System.out.println("Introduceti username-ul dorit: ");
            username = acc.next();

            System.out.println("Introduceti parola: ");
            password = acc.next();

    }
}
