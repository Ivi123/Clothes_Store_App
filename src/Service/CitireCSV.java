package Service;

import Products.Men_Clothes;
import Products.Men_Sale;
import Products.Women_Clothes;
import Products.Women_Sale;
import Stores.Physical_Store;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CitireCSV {
    public static ArrayList<Men_Clothes> citirem(String file_path) throws IllegalAccessException, InstantiationException {
        ArrayList<Men_Clothes> haine = new ArrayList<>();
        File fopen = new File(file_path);
        Men_Clothes haina = Singleton.getInstance(Men_Clothes.class);
        Scanner scanner = null;
        try {
            scanner = new Scanner(fopen);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.exit(0);
        }
        String data = scanner.nextLine();
        while(scanner.hasNextLine()){
            data = scanner.nextLine();
            String[] linie = data.split(",");
            haina.setName(linie[0]);
            haina.setCategory(linie[1]);
            haina.setColor(linie[2]);
            haina.setFabric(linie[3]);
            haina.setPrice(Double.parseDouble(linie[4]));
            //Men_Clothes haina = new Men_Clothes(linie[0], linie[1], linie[2], linie[3], Double.parseDouble(linie[4]));
            haine.add(new Men_Clothes(haina));
        }
        return haine;
    }

    public static ArrayList<Women_Clothes> citirew(String file_path) throws IllegalAccessException, InstantiationException {
        ArrayList<Women_Clothes> haine = new ArrayList<>();
        File fopen = new File(file_path);
        Women_Clothes haina = Singleton.getInstance(Women_Clothes.class);
        Scanner scanner = null;
        try {
            scanner = new Scanner(fopen);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.exit(0);
        }
        String data = scanner.nextLine();
        while(scanner.hasNextLine()){
            data = scanner.nextLine();
            String[] linie = data.split(",");
            haina.setName(linie[0]);
            haina.setCategory(linie[1]);
            haina.setColor(linie[2]);
            haina.setFabric(linie[3]);
            haina.setPrice(Double.parseDouble(linie[4]));
            haine.add(new Women_Clothes(haina));
        }
        return haine;
    }

    public static ArrayList<Men_Sale> citirems(String file_path) throws IllegalAccessException, InstantiationException {
        ArrayList<Men_Sale> haine = new ArrayList<>();
        Men_Sale haina = Singleton.getInstance(Men_Sale.class);
        File fopen = new File(file_path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(fopen);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.exit(0);
        }
        String data = scanner.nextLine();
        while(scanner.hasNextLine()){
            data = scanner.nextLine();
            String[] linie = data.split(",");
            haina.setName(linie[0]);
            haina.setCategory(linie[1]);
            haina.setColor(linie[2]);
            haina.setFabric(linie[3]);
            haina.setPrice(Double.parseDouble(linie[4]));
            haina.setDiscount(Double.parseDouble(linie[5]));
            haine.add(new Men_Sale(haina));
        }
        return haine;
    }

    public static ArrayList<Women_Sale> citirews(String file_path) throws IllegalAccessException, InstantiationException {
        ArrayList<Women_Sale> haine = new ArrayList<>();
        Women_Sale haina = Singleton.getInstance(Women_Sale.class);
        File fopen = new File(file_path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(fopen);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.exit(0);
        }
        String data = scanner.nextLine();
        while(scanner.hasNextLine()){
            data = scanner.nextLine();
            String[] linie = data.split(",");
            haina.setName(linie[0]);
            haina.setCategory(linie[1]);
            haina.setColor(linie[2]);
            haina.setFabric(linie[3]);
            haina.setPrice(Double.parseDouble(linie[4]));
            haina.setDiscount(Double.parseDouble(linie[5]));
            haine.add(new Women_Sale(haina));
        }
        return haine;
    }

    public static ArrayList<Physical_Store> citireps(String file_path) throws IllegalAccessException, InstantiationException {
        ArrayList<Physical_Store> stores = new ArrayList<>();
        Physical_Store store = Singleton.getInstance(Physical_Store.class);
        File fopen = new File(file_path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(fopen);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.exit(0);
        }
        String data = scanner.nextLine();
        while(scanner.hasNextLine()){
            data = scanner.nextLine();
            String[] linie = data.split(",");
            store.setLocation(linie[0]);
            store.setStore_id(Integer.parseInt(linie[1]));
            store.setNr_ofemp(Integer.parseInt(linie[2]));
            stores.add(store);
        }
        return stores;
    }
}
