package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try
        {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/sakila", "root", "");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM actor;");
            while (rs.next())
            {
                System.out.println(rs.getInt(1) + ". " + rs.getString(2) + " " + rs.getString(3));
            }
            con.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
