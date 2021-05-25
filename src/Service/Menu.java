package Service;

import java.io.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

import Clients.Customer_Account;
import Clients.Shopping_Bag;
import DataBase.Afisare;
import DataBase.Inserare;
import DataBase.Stergere;
import DataBase.Update;
import Products.Men_Clothes;
import Products.Men_Sale;
import Products.Women_Clothes;
import Products.Women_Sale;
import Stores.Physical_Store;

public class Menu {

    public static void meniu() throws IOException, SQLException {
        System.out.println("-----------------------CLOTHES STORE APP-----------------------");
        System.out.println("-----------Alegeti o optiune pe care doriti sa o executati-------------");
        System.out.println();
        System.out.println("1. Afisare haine barbati ");
        System.out.println("2. Afisare haine femei ");
        System.out.println("3. Aplicati discountul unui produs (categorie: femei) ");
        System.out.println("4. Aplicati discountul unui produs (categorie: barbati) ");
        System.out.println("5. Creaza-ti un cont nou ");
        System.out.println("6. Adaugare obiecte in cos ");
        System.out.println("7. Afisare lista magazine din tara ");
        System.out.println("8. Adauga un nou angajat ");
        System.out.println("9. Accesare baza de date");
        System.out.println("10. Iesire ");

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int option;
        ArrayList<Men_Clothes> listm = null;
        ArrayList<Women_Clothes> listw = null;
        ArrayList<Women_Sale> listws = null;
        ArrayList<Men_Sale> listms = null;
        ArrayList<Physical_Store> store = null;

        do {
            System.out.println("Optiunea dvs. este: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    try {
                        listm = CitireCSV.citirem("src/Fisiere/Men_Clothes.csv");
                    } catch (IllegalAccessException | InstantiationException e) {
                        e.printStackTrace();
                    }

                    for (int i = 0; i < 3; i++) {
                        System.out.println(listm.get(i).getCode());
                        listm.get(i).DisplayMCLTH();
                    }
                    break;

                case 2:

                    try {
                        listw = CitireCSV.citirew("src/Fisiere/Women_Clothes.csv");
                    } catch (IllegalAccessException | InstantiationException e) {
                        e.printStackTrace();
                    }

                    for (int i = 0; i < 3; i++) {
                        System.out.println(listw.get(i).getCode());
                        listw.get(i).DisplayWCLTH();
                    }
                    break;

                case 3:

                    try {
                        listws = CitireCSV.citirews("src/Fisiere/Women_Sale.csv");
                    } catch (IllegalAccessException | InstantiationException e) {
                        e.printStackTrace();
                    }

                    //afisez produsul cu pretul initial
                    System.out.println(listws.get(0).getCodews());
                    listws.get(0).DisplayWCLTH();
                    //apoi aplic discountul si il afisez
                    listws.get(0).Discount();
                    break;

                case 4:

                    try {
                        listms = CitireCSV.citirems("src/Fisiere/Men_Sale.csv");
                    } catch (IllegalAccessException | InstantiationException e) {
                        e.printStackTrace();
                    }

                    //afisez produsul cu pretul initial
                    System.out.println(listms.get(0).getCodems());
                    listms.get(0).DisplayMCLTH();
                    //apoi aplic discountul si il afisez
                    listms.get(0).Discount();
                    break;

                case 5:
                    Customer_Account customer_account = new Customer_Account();
                    customer_account.create_account();
                    auditCA("src/Fisiere/audit.csv", customer_account);
                    System.out.println("Contul a fost creat cu succes!");
                    break;

                case 6:
                    //adaugare obiecte in cos + calcul pret total + calcul puncte
                    Shopping_Bag sb = new Shopping_Bag(302, 103, "Popescu Radu"); // detalile cardului de fidelitate
                    sb.addproduct();
                    System.out.println("Your Fidelity Card has " + sb.getPoints() + " points!" + '\n');
                    break;

                case 7:
                    try {
                        store = CitireCSV.citireps("src/Fisiere/Physical_Store.csv");
                    } catch (IllegalAccessException | InstantiationException e) {
                        e.printStackTrace();
                    }
                    // am initialiazat cu 0 nr de angajati pt ca ii bag mai tarziu in vectorul Staff

                    Collections.sort(store);

                    int i = 0;
                    for (Physical_Store s : store) {
                        System.out.println("Magazinul " + ++i + ": " + " Locatie: " + s.getLocation() + "  ID: " + s.getStore_id() + '\n');
                    }
                    break;

                case 8:
                    store.get(0).add_employee("Ionut", "Moise", "Manager", "0763621371"); //am adaugat in magazinul anterior angajatul Moise Ionut
                    store.get(0).add_employee("Mariana", "Tanase", "Cashier", "0731131974");
                    store.get(0).Dispaly_staff();
                    break;

                case 9:
                    System.out.println("-----------------------Ati accesat baza de date a magazinului! Acum puteti executa diferite actiuni!-----------------------");
                    System.out.println("----------------------------------Alegeti o optiune pe care doriti sa o executati---------------------------------------");
                    System.out.println();
                    System.out.println("1. Afisare haine barbati ");
                    System.out.println("2. Afisare haine femei ");
                    System.out.println("3. Afisare haine reduse (categorie: femei)");
                    System.out.println("4. Afisare haine reduse (categorie: barbati)");
                    System.out.println("5. Afisare magazine din tara");
                    System.out.println("6. Inserare produs barbati");
                    System.out.println("7. Inserare produs femei");
                    System.out.println("8. Inserare magazin");
                    System.out.println("9. Update pret produs (femei)");
                    System.out.println("10. Update pret produs (barbati)");
                    System.out.println("11. Stergere magazin");
                    System.out.println("12. Iesire ");

                    do {
                        System.out.println("Optiunea dvs. este: ");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                Afisare af1 = new Afisare();
                                af1.afisareMC();
                                break;

                            case 2:
                                Afisare af2 = new Afisare();
                                af2.afisareWC();
                                break;

                            case 3:
                                Afisare af3 = new Afisare();
                                af3.afisareWS();
                                break;

                            case 4:
                                Afisare af4 = new Afisare();
                                af4.afisareMS();
                                break;

                            case 5:
                                Afisare af5 = new Afisare();
                                af5.afisarePS();
                                break;

                            case 6:
                                Inserare in1 = new Inserare();
                                in1.inserareMC();
                                break;

                            case 7:
                                Inserare in2 = new Inserare();
                                in2.inserareWC();
                                break;

                            case 8:
                                Inserare in3 = new Inserare();
                                in3.inserarePS();
                                break;

                            case 9:
                                Update up1 = new Update();
                                up1.updateWS();
                                break;

                            case 10:
                                Update up2 = new Update();
                                up2.updateMS();
                                break;

                            case 11:
                                Stergere st = new Stergere();
                                st.stergerePS();
                                break;

                            case 12:
                                System.exit(0);
                                break;

                            default:
                                System.out.println("Optiune gresita! Introduceti un numar din lista!");
                        }

                    } while (option != 12);
                    break;

                case 10:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Optiune gresita! Introduceti un numar din lista!");

            }

        } while (option != 10);
    }

    public static void auditCA(String file_path, Customer_Account c) throws IOException {
        File verif = new File(file_path);
        boolean ok = verif.isFile();

        FileWriter fw = new FileWriter(file_path, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw);
        if(!ok)
            out.println("nume_actiune, timestamp");

        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = dateFormat.format(date);
        out.println("Contul persoanei: " + c.getFirst_name() + " " + c.getLast_name() +" a fost creat cu username-ul: " + c.getUsername() + "," + strDate);
        out.close();
    }
}

