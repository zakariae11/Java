package DB;

import java.sql.*;
import java.util.Scanner;

public class UpdateDB {


           
    	public static void main(String[] args) {
    	    String url = "jdbc:mysql://localhost/mydb";
    	    String driver = "com.mysql.cj.jdbc.Driver";
    	        
    	    try {
    	           
    	        Class.forName(driver);
    	        Connection con = DriverManager.getConnection(url, "root", "");
    	        Statement st = con.createStatement();
    	            
    	        Scanner in = new Scanner(System.in);
    	        System.out.println("Enter new CNE:");
    	        String cne1 = in.nextLine();   

    	        System.out.println("Enter new First Name:");
    	        String f_name1 = in.nextLine();

    	        System.out.println("Enter new Last Name:");
    	        String l_name1 = in.nextLine();
    	            
    	        System.out.println("Update by:");
    	        System.out.println("1-CNE \n2-First Name \n3-Last Name");
    	        int choix = in.nextInt();
    	        in.nextLine();
    	         
    	        if(choix == 1){
    	            System.out.println("Enter CNE:");
    	            String cne2 = in.nextLine();
    	            int t = st.executeUpdate("UPDATE `etudiant` SET CNE='"+ cne1 +"', First_Name='"+f_name1+"', Last_Name='"+ l_name1 +"' WHERE CNE = '"+ cne2 +"'");
    	            System.out.println("Data updated!");
    	        }
    	        else if(choix == 2){
    	            System.out.println("Enter First Name:");
    	            String f_name2 = in.nextLine();
    	            int t = st.executeUpdate("UPDATE `etudiant` SET CNE='" + cne1 + "', First_Name='"+ f_name1 +"', Last_Name='" + l_name1 +"' WHERE `First Name` ='" + f_name2 +"'");
    	            System.out.println("Data updated!");
    	        }
    	        else if(choix == 3){
    	            System.out.println("Enter Last Name:");
    	            String l_name2 = in.nextLine();
    	            int t = st.executeUpdate("UPDATE `etudiant` SET CNE='" + cne1 + "', First_Name='"+ f_name1 +"', Last_Name='" + l_name1 + "' WHERE `Last Name`='"+ l_name2 + "'");
    	            System.out.println("Data updated!");
    	        }
    	        else {
    	        	System.out.println("Your choice Doesn't exist.");
    	        }

    	        in.close();
    	        st.close();
    	        con.close();
    	       

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " \nsource: " + e.getStackTrace());
        }
	}


}
