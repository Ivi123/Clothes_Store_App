package DataBase;

import java.sql.*;

public class Afisare {

    String url = "jdbc:mysql://localhost:3306/clothes_store_app";
    String username = "root";
    String password = "";

    public void afisareMC() throws SQLException {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM men_clothes";
            Statement stat = con.createStatement();
            ResultSet res = stat.executeQuery(query);

            while(res.next()){

                System.out.println(res.getInt("idMen_Clothes"));
                System.out.println(res.getString("Name"));
                System.out.println(res.getString("Category"));
                System.out.println(res.getString("Color"));
                System.out.println(res.getString("Fabric"));
                System.out.println(res.getDouble("Price"));
                System.out.println();
            }
            con.close();

        } catch (SQLException trowables) {
            trowables.printStackTrace();
        }
    }

    public void afisareWC() throws SQLException {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM women_clothes";
            Statement stat = con.createStatement();
            ResultSet res = stat.executeQuery(query);

            while(res.next()){

                System.out.println(res.getInt("idwomen_clothes"));
                System.out.println(res.getString("Name"));
                System.out.println(res.getString("Category"));
                System.out.println(res.getString("Color"));
                System.out.println(res.getString("Fabric"));
                System.out.println(res.getDouble("Price"));
                System.out.println();
            }
            con.close();

        } catch (SQLException trowables) {
            trowables.printStackTrace();
        }
    }

    public void afisareWS() throws SQLException {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM women_sale";
            Statement stat = con.createStatement();
            ResultSet res = stat.executeQuery(query);

            while(res.next()){

                System.out.println(res.getInt("idwomen_sale"));
                System.out.println(res.getString("Name"));
                System.out.println(res.getString("Category"));
                System.out.println(res.getString("Color"));
                System.out.println(res.getString("Fabric"));
                System.out.println(res.getDouble("Price"));
                System.out.println(res.getDouble("Discount"));
                System.out.println();
            }
            con.close();

        } catch (SQLException trowables) {
            trowables.printStackTrace();
        }
    }

    public void afisareMS() throws SQLException {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM men_sale";
            Statement stat = con.createStatement();
            ResultSet res = stat.executeQuery(query);

            while(res.next()){

                System.out.println(res.getInt("idMen_Sale"));
                System.out.println(res.getString("Name"));
                System.out.println(res.getString("Category"));
                System.out.println(res.getString("Color"));
                System.out.println(res.getString("Fabric"));
                System.out.println(res.getDouble("Price"));
                System.out.println(res.getDouble("Discount"));
                System.out.println();
            }
            con.close();

        } catch (SQLException trowables) {
            trowables.printStackTrace();
        }
    }

    public void afisarePS() throws SQLException {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM physical_store";
            Statement stat = con.createStatement();
            ResultSet res = stat.executeQuery(query);

            while(res.next()){

                System.out.println(res.getInt("idPhysical_Store"));
                System.out.println(res.getString("Location"));
                System.out.println(res.getString("Number of employees"));
                System.out.println();
            }
            con.close();

        } catch (SQLException trowables) {
            trowables.printStackTrace();
        }
    }
}