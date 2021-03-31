package Service;

import Clients.Customer_Account;
import Clients.Shopping_Bag;
import Products.Men_Clothes;
import Products.Men_Sale;
import Products.Women_Clothes;
import Products.Women_Sale;
import Stores.Physical_Store;

import java.util.*;

//adaugare haine barbati
//listare haine barbati
//adaugare haine barbati
//listare haine femei
//aplicare discount produs femei
//aplicare discount produs barbati
//adaugare obiect nou in cos cu clasa Scanner
//adaugare obiecte in cos + calcul pret total + calcul puncte
//adaugare angajat in magazin
//afisare angajati dintr-un anumit magazin..
//sortare in ordine alfabetica a magazinelor dupa locatie
//sau sortare cresc a magazinelor dupa cod

public class Main {

    public static void main(String[] args) {

        Men_Clothes listm[] = new Men_Clothes[10];
        listm[0] = new Men_Clothes("Cap", "Hats", "Black", "Polyester", 6.99);
        listm[1] = new Men_Clothes("Polo T-Shirt", "T-shirts", "Bleumarin", "Cotton", 9.99);
        listm[2] = new Men_Clothes("Cargo Trousers", "Trousers", "Red", "Cotton",29.99 );

        for(int i = 0; i < 3; i++ )
        {
            System.out.println(listm[i].getCode());
            listm[i].DisplayMCLTH();
        }


        Women_Clothes listw[] = new Women_Clothes[10];
        listw[0] = new Women_Clothes("Midi Dress", "Dresses", "Beige", "Cotton", 24.99 );
        listw[1] = new Women_Clothes("Viscose V-neck T-shirt", "T-shirts", "White", "Viscose", 8.99 );
        listw[2] = new Women_Clothes("High Waist Jeans", "Jeans", "Blue", "Denim", 24.99 );

        for(int i = 0; i < 3; i++ )
        {
            System.out.println(listw[i].getCode());
            listw[i].DisplayWCLTH();
        }

        Women_Sale listws[] = new Women_Sale[10];
        listws[0] = new Women_Sale("Belted skirt", "Skirts", "Pink", "Cotton", 34.99, 30);
        //afisez produsul cu pretul initial
        System.out.println(listws[0].getCodews());
        listws[0].DisplayWCLTH();
        //apoi aplic discountul si il afisez
        listws[0].Discount();

        Men_Sale listms[] = new Men_Sale[10];
        listms[0] = new Men_Sale("10-pack socks", "Socks", "Black", "Cotton", 9.99, 10);
        //afisez produsul cu pretul initial
        System.out.println(listms[0].getCodems());
        listms[0].DisplayMCLTH();
        //apoi aplic discountul si il afisez
        listms[0].Discount();

        //creez un obiect pt Custommer_Account
        Customer_Account acc = new Customer_Account();
        acc.setFirst_name("Marius");
        acc.setLast_name("Gherman");
        acc.setAge(24);
        acc.setUsername("mgherman");
        //creez un nou cont prin metoda
        Customer_Account customer_account = new Customer_Account();
        customer_account.create_account();

        //adaugare obiecte in cos + calcul pret total + calcul puncte
        Shopping_Bag sb = new Shopping_Bag(302, 103, "Popescu Radu"); // detalile cardului de fidelitate
        sb.addproduct();
        sb.addproduct2(listm[0]); //aici adaug in cos primul produs de la barbati
        System.out.println("Your Fidelity Card has " + sb.getPoints() + " points!" + '\n');

        //adaugare angajat in magazin

        Physical_Store[] store = new Physical_Store[3];

        Physical_Store store1 = new Physical_Store("Bucuresti",3,0); // am initialiazt cu 0 nr de angajati pt ca ii bag mai tarziu in vectorul Staff
        Physical_Store store2 = new Physical_Store("Arad", 5, 0);
        Physical_Store store3 = new Physical_Store("Argeș", 7, 0);

        store[0] = store1;
        store[1] = store2;
        store[2] = store3;
        Arrays.sort(store);

        int i = 0;
        for (Physical_Store s : store){
            System.out.println("Magazinul " + ++i + ": " + " Locatie: " + s.getLocation() + "  ID: " + s.getStore_id() + '\n' );
        }

        store[0].add_employee("Ionut", "Moise", "Manager", "0763621371"); //am adaugat in magazinul anterior angajatul Moise Ionut
        store[0].add_employee("Mariana", "Tanase", "Cashier", "0731131974");

        store[0].Dispaly_staff();


    }
}
