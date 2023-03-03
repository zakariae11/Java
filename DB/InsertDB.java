package DB;

import java.sql.*;
import java.util.Scanner;

public class InsertDB {
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
        
        System.out.println("Entrez prenom: ");
        String prenom = in.nextLine();
        
        System.out.println("Entrez nom: ");
        String nom = in.nextLine();
        int t = st.executeUpdate("INSERT INTO `etudiant`(`CNE`, `FIRST NAME`, `LAST NAME`) VALUES ('"+cne +" ','" + prenom +"','" + nom + "')");
        System.out.println("Data Added!");

        in.close();
        st.close();
        con.close();
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage() + " \nsource: " + e.getStackTrace());
    }
    }
}
