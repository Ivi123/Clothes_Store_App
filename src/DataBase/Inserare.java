package DataBase;

import java.sql.*;
import java.util.Scanner;

public class Inserare {

    String url = "jdbc:mysql://localhost:3306/clothes_store_app";
    String username = "root";
    String password = "";

    public void inserareMC() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Id-ul produsului este: ");
        int id = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Denumirea produsului: ");
        String name = scanner2.next();
        System.out.println("Categoria: ");
        String category = scanner2.next();
        System.out.println("Culoarea: ");
        String color = scanner2.next();
        System.out.println("Materialul: ");
        String fabric = scanner2.next();
        System.out.println("Pretul: ");
        double price = scanner.nextDouble();

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = con.prepareStatement("INSERT INTO clothes_store_app.men_clothes (idMen_Clothes, Name, Category, Color, Fabric, Price) VALUES ('"+id+"','"+name+"','"+category+"','"+color+"','"+fabric+"','"+price+"')");

            int status = ps.executeUpdate();
            if (status!=0){
                System.out.println("Obiectul a fost inserat!");
            }

            con.close();

        } catch (SQLException trowables) {
            trowables.printStackTrace();
        }
    }

    public void inserareWC() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Id-ul produsului este: ");
        int id = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Denumirea produsului: ");
        String name = scanner2.next();
        System.out.println("Categoria: ");
        String category = scanner2.next();
        System.out.println("Culoarea: ");
        String color = scanner2.next();
        System.out.println("Materialul: ");
        String fabric = scanner2.next();
        System.out.println("Pretul: ");
        double price = scanner.nextDouble();

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = con.prepareStatement("INSERT INTO clothes_store_app.women_clothes (idwomen_clothes, Name, Category, Color, Fabric, Price) VALUES ('"+id+"','"+name+"','"+category+"','"+color+"','"+fabric+"','"+price+"')");

            int status = ps.executeUpdate();
            if (status!=0){
                System.out.println("Obiectul a fost inserat!");
            }

            con.close();

        } catch (SQLException trowables) {
            trowables.printStackTrace();
        }
    }

    public void inserarePS() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Id-ul magazinului este: ");
        int id = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Locatia magazinului: ");
        String loc = scanner2.next();
        System.out.println("Numar angajati: ");
        int nrofemp = scanner.nextInt();

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = con.prepareStatement("INSERT INTO clothes_store_app.physical_store (idPhysical_Store, Location, Number of employees) VALUES ('"+id+"','"+loc+"','"+nrofemp+"')");

            int status = ps.executeUpdate();
            if (status!=0){
                System.out.println("Magazinul a fost inserat!");
            }

            con.close();

        } catch (SQLException trowables) {
            trowables.printStackTrace();
        }
    }
}
