package DB;

import java.sql.*;
import java.util.Scanner;

public class DeleteDB {

	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/mydb";
        String driver = "com.mysql.cj.jdbc.Driver";

    try {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, "root", "");
        Statement st = con.createStatement();
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Delete by:");
        System.out.println("1-ID \n2-CNE \n3-First Name \n4-Last Name");
        int choix = in.nextInt();
        in.nextLine();
        
        if(choix == 1) {
            System.out.println("Enter column's ID to delete:");
            int id = in.nextInt();
        	int t = st.executeUpdate("DELETE FROM `etudiant` WHERE ID = '" + id + "'");
        	System.out.println("Data deleted!");
        }
        else if(choix == 2) {
            System.out.println("Enter column's CNE to delete:");
            String cne = in.nextLine();
        	int t = st.executeUpdate("DELETE FROM `etudiant` WHERE CNE = '" + cne + "'");
        	System.out.println("Data deleted!");
        }      
        else if(choix == 3) {
            System.out.println("Enter column's First Name to delete:");
            String f_name = in.nextLine();
        	int t = st.executeUpdate("DELETE FROM `etudiant` WHERE `First Name` = '" + f_name + "'");
        	System.out.println("Data deleted!");
        }        
        else if(choix == 4) {
            System.out.println("Enter column's Last Name to delete:");
            String l_name = in.nextLine();
        	int t = st.executeUpdate("DELETE FROM `etudiant` WHERE `Last Name` = '" + l_name + "'");
        	System.out.println("Data deleted!");
        }
        else {
        	System.out.println("Your choice Doesn't exist.");
        };

        in.close();
        st.close();
        con.close();
        
      } catch (Exception e) {
          System.out.println("Error:"+ e.getMessage() + "\nSource:" + e.getStackTrace());
    }

	}

}
