package Stores;

public class Physical_Store implements Comparable<Object> {
    private String location;
    private int store_id, nr_ofemp;
    private Staff[] staff = new Staff[2];

    public Physical_Store() {
    }

    public Physical_Store(String location, int store_id, int nr_ofemp) {
        this.location = location;
        this.store_id = store_id;
        this.nr_ofemp = nr_ofemp;

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

    public int getNr_ofemp() {
        return nr_ofemp;
    }

    public void setNr_ofemp(int nr_ofemp) {
        this.nr_ofemp = nr_ofemp;
    }

    public void add_employee(String first_name, String last_name, String role, String phone_number) {
        if (nr_ofemp < this.staff.length) {
            this.staff[this.nr_ofemp++] = new Staff(first_name, last_name, role, phone_number);
        }
    }

    public void Dispaly_staff() {
        System.out.println("Urmatorii angajati lucreaza in magazinul din " + this.location);
        for (int i = 0; i < staff.length; i++) {
            System.out.println(staff[i].getFirst_name() + " " + staff[i].getLast_name());
            System.out.println(staff[i].getPhone_number());
            System.out.println(staff[i].getRole());
            System.out.println('\n');
        }
    }

    @Override
    public int compareTo(Object o) {
        String loc = this.location;
        String o_loc = ((Physical_Store) o).location;
        return loc.compareTo(o_loc); // in ordine alfabetica
    }

  /*  @Override
    public int compareTo(Object o) {
        int cod = 0;
        if(o == null){
            return 0;
        }
        if (o instanceof Physical_Store)
          cod = ((Physical_Store) o).getStore_id();

        return this.store_id - cod; // crescator dupa cod
    }
*/
}
