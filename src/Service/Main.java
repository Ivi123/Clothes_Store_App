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

        ArrayList<Men_Clothes> listm = null;

        try{
            listm = CitireCSV.citirem("src/Fisiere/Men_Clothes.csv");
        }
        catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        for(int i = 0; i < 3; i++ )
        {
            System.out.println(listm.get(i).getCode());
            listm.get(i).DisplayMCLTH();
        }


        ArrayList<Women_Clothes> listw = null;
        try{
            listw = CitireCSV.citirew("src/Fisiere/Women_Clothes.csv");
        }
        catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        for(int i = 0; i < 3; i++ )
        {
            System.out.println(listw.get(i).getCode());
            listw.get(i).DisplayWCLTH();
        }


        ArrayList<Women_Sale> listws = null;
        try{
            listws = CitireCSV.citirews("src/Fisiere/Women_Sale.csv");
        }
        catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        //afisez produsul cu pretul initial
        System.out.println(listws.get(0).getCodews());
        listws.get(0).DisplayWCLTH();
        //apoi aplic discountul si il afisez
        listws.get(0).Discount();


        ArrayList<Men_Sale> listms = null;
        try{
            listms = CitireCSV.citirems("src/Fisiere/Men_Sale.csv");
        }
        catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        //afisez produsul cu pretul initial
        System.out.println(listms.get(0).getCodems());
        listms.get(0).DisplayMCLTH();
        //apoi aplic discountul si il afisez
        listms.get(0).Discount();

//        //creez un obiect pt Custommer_Account
//        Customer_Account acc = new Customer_Account();
//        acc.setFirst_name("Marius");
//        acc.setLast_name("Gherman");
//        acc.setAge(24);
//        acc.setUsername("mgherman");
//        //creez un nou cont prin metoda
//        Customer_Account customer_account = new Customer_Account();
//        customer_account.create_account();
//
//        //adaugare obiecte in cos + calcul pret total + calcul puncte
//        Shopping_Bag sb = new Shopping_Bag(302, 103, "Popescu Radu"); // detalile cardului de fidelitate
//        sb.addproduct();
//        sb.addproduct2(listm.get(0)); //aici adaug in cos primul produs de la barbati
//        System.out.println("Your Fidelity Card has " + sb.getPoints() + " points!" + '\n');
//        //adaugare angajat in magazin

        ArrayList<Physical_Store> store = null;
        try{
            store = CitireCSV.citireps("src/Fisiere/Physical_Store.csv");
        }
        catch(IllegalAccessException | InstantiationException e) {
            e.printStackTrace();}
         // am initialiazat cu 0 nr de angajati pt ca ii bag mai tarziu in vectorul Staff

        Collections.sort(store);

        int i = 0;
        for (Physical_Store s : store){
            System.out.println("Magazinul " + ++i + ": " + " Locatie: " + s.getLocation() + "  ID: " + s.getStore_id() + '\n' );
        }

        store.get(0).add_employee("Ionut", "Moise", "Manager", "0763621371"); //am adaugat in magazinul anterior angajatul Moise Ionut
        store.get(0).add_employee("Mariana", "Tanase", "Cashier", "0731131974");

        store.get(0).Dispaly_staff();
        int nr = store.get(0).getNr_ofemp();//am verificat nr de angajati pt primul magazin
        System.out.println(nr);


    }
}
