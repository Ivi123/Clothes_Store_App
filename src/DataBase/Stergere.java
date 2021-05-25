package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Stergere {

    String url = "jdbc:mysql://localhost:3306/clothes_store_app";
    String username = "root";
    String password = "";

    public void stergerePS() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Introduceti id-ul magazinului pe care doriti sa-l stergeti: ");
        int id = scanner.nextInt();

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = con.prepareStatement("DELETE FROM clothes_store_app.physical_store WHERE idPhysical_Store = '"+id+"' ");

            int status = ps.executeUpdate();
            if (status!=0){
                System.out.println("Magazinul a fost sters!");
            }

            con.close();

        } catch (SQLException trowables) {
            trowables.printStackTrace();
        }
    }
}
