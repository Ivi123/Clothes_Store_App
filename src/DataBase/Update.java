package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

    String url = "jdbc:mysql://localhost:3306/clothes_store_app";
    String username = "root";
    String password = "";

    public void updateWS() throws SQLException {
        // vreau sa fac update pretului unui produs cu id-ul x
        Scanner scanner = new Scanner(System.in);
        System.out.println("Id-ul produsului este: ");
        int id = scanner.nextInt();
        System.out.println("Discount: ");
        double discount = scanner.nextDouble();
        System.out.println("Noul pretul: ");
        double price = scanner.nextDouble();

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = con.prepareStatement("UPDATE clothes_store_app.women_sale SET Price = '"+price+"', Discount = '"+discount+"' WHERE idwomen_sale = '"+id+"' ");

            int status = ps.executeUpdate();
            if (status!=0){
                System.out.println("Obiectul a fost actualizat!");
            }

            con.close();

        } catch (SQLException trowables) {
            trowables.printStackTrace();
        }
    }

    public void updateMS() throws SQLException {
        // vreau sa fac update pretului unui produs cu id-ul x
        Scanner scanner = new Scanner(System.in);
        System.out.println("Id-ul produsului este: ");
        int id = scanner.nextInt();
        System.out.println("Discount: ");
        double discount = scanner.nextDouble();
        System.out.println("Noul pretul: ");
        double price = scanner.nextDouble();

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = con.prepareStatement("UPDATE clothes_store_app.men_sale SET Price = '"+price+"', Discount = '"+discount+"' WHERE idMen_Sale = '"+id+"' ");

            int status = ps.executeUpdate();
            if (status!=0){
                System.out.println("Obiectul a fost actualizat!");
            }

            con.close();

        } catch (SQLException trowables) {
            trowables.printStackTrace();
        }
    }
}
