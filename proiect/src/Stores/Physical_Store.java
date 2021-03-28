package Stores;

import java.util.SortedSet;
import java.util.TreeSet;

public class Physical_Store {
    private String location;
    private int store_id, nr_ofemp;
    private Staff[] staff = new Staff[10];
    //private SortedSet<Staff> employees = new TreeSet<>();

    public Physical_Store() {
    }

    public Physical_Store(String location, int store_id, int nr_ofemp, Staff[] staff) {
        this.location = location;
        this.store_id = store_id;
        this.nr_ofemp = nr_ofemp;
        this.staff = staff;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }



    public void add_employee(String first_name, String last_name, String role, String phone_number)
    {
        if(nr_ofemp < this.staff.length) {
            this.staff[this.nr_ofemp++] = new Staff(first_name, last_name, role, phone_number);
        }
    }

    public void Dispaly_staff()
    {
        System.out.println("Urmatorii angajati lucreaza in magazinul din " + this.location);
        for(int i = 0; i < staff.length; i++) {
            System.out.println(staff[i].getFirst_name() + " " + staff[i].getLast_name());
            System.out.println(staff[i].getPhone_number());
            System.out.println(staff[i].getRole());
            System.out.println('\n');
        }
    }
}
