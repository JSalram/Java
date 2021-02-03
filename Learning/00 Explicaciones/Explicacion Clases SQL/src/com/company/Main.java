package com.company;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        String conString = "jdbc:sqlite:J:\\DAW\\PROG. Programacion\\Clases\\Explicacion Clases SQL\\cine.db";
        Connection con;
        try
        {
            con = DriverManager.getConnection(conString);

            Statement st = con.createStatement();

            // Para consultas SQL que devuelven datos
            String sql = "INSERT INTO actores (nombre, fechaNacimiento) VALUES " +
                    "('Arnold Schwarzenegger', '1947-07-30');";
            st.execute(sql);
            String sqlid = "SELECT last_insert_rowid();";
            ResultSet rsid = st.executeQuery(sqlid);
            rsid.next();
            int idInsertado = rsid.getInt(1);
            System.out.println("ID de Arnold = " + idInsertado);

            // Para consultas SQL que no devuelven datos
            String sql2 = "SELECT * FROM actores;";
            // Para leer primero sacamos un ResultSet
            ResultSet rs = st.executeQuery(sql2);


            // Cada vez que ponemos rs.next() se lee un registro
            // rs.next();
            while (rs.next())
            {
                // De cada registro podemos ir leyendo los campos
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                LocalDate fecha2 = LocalDate.parse(rs.getString("fechaNacimiento"));

                System.out.println("id = " + id + ", nombre = " + nombre +
                        ", fecha = " + fecha2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }

            con.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
