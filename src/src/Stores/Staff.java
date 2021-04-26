package Stores;

public class Staff {
    public String first_name, last_name, role;
    String phone_number;

    public Staff() {
    }

    public Staff(String first_name, String last_name, String role, String phone_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
        this.phone_number = phone_number;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
