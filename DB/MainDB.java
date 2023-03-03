package DB;

import java.sql.*;
import java.util.Scanner;

public class MainDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/mydb";
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement st = con.createStatement();
            
            Scanner in = new Scanner(System.in);
            System.out.println("Entrez cne: ");
            String cne = in.nextLine();
            
            
            ResultSet res = st.executeQuery("SELECT * FROM Etudiant WHERE CNE='"+ cne + "'");
            while (res.next()) {
                System.out.println("\nID: " + res.getString(1) + "\nCNE: " + res.getString(2) + "\nPrenom: "+ res.getString(3) + "\nNom: " + res.getString(4)+"\n");
            }
            in.close();
            res.close();
            st.close();
            con.close();

         } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " source: " + e.getStackTrace());
        }
    }
}
