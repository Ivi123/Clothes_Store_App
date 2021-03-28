package Clients;

public class Customer_Account {
    protected String first_name, last_name;
    protected int age;
    private String username;

    public Customer_Account() {
    }

    public Customer_Account(String first_name, String last_name, int age, String username) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.username = username;
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
}

