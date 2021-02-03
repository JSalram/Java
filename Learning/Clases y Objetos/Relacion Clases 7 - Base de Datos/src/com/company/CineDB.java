package com.company;

import java.security.InvalidParameterException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CineDB
{
    Connection conn;

    public CineDB (String connString)
    {
        try
        {
            conn = DriverManager.getConnection(connString);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public int insertaPelicula (String titulo, int anno, boolean tieneOscar, double valoracion)
    {
        try
        {
            Statement st = conn.createStatement();
            String sql = "INSERT INTO peliculas (titulo, anno, tieneOscar, valoracion) VALUES " +
                    "('" + titulo + "', '" + anno + "', '" + tieneOscar + "', '" + valoracion + "');";
            st.execute(sql);

            String sqlid = "SELECT last_insert_rowid();";
            ResultSet rsid = st.executeQuery(sqlid);
            rsid.next();
            return rsid.getInt(1);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return 0;
        }
    }
    public int insertaActor (String nombre, LocalDate fechaNacimiento)
    {
        try
        {
            Statement st = conn.createStatement();
            String sql = "INSERT INTO actores (nombre, fechaNacimiento) VALUES " +
                    "('" + nombre + "', '" + fechaNacimiento + "');";
            st.execute(sql);

            String sqlid = "SELECT last_insert_rowid();";
            ResultSet rsid = st.executeQuery(sqlid);
            rsid.next();
            return rsid.getInt(1);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return 0;
        }
    }
    public void asociaActorPelicula (int idActor, int idPelicula, boolean principal)
    {
        try
        {
            Statement st = conn.createStatement();
            String sql = "INSERT INTO actoresPeliculas (idActor, idPelicula, principal) VALUES " +
                    "('" + idActor + "', '" + idPelicula + "', " + principal + ");";
            st.execute(sql);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    public int buscaActor (String nombre)
    {
        int id = -1;
        try
        {
            Statement st = conn.createStatement();
            String sql = "SELECT id FROM actores WHERE nombre = '" + nombre + "';";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next())
            {
                id = rs.getInt("id");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return id;
    }
    public int buscaPelicula (String titulo)
    {
        int id = -1;
        try
        {
            Statement st = conn.createStatement();
            String sql = "SELECT id FROM peliculas WHERE titulo = '" + titulo + "';";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next())
            {
                id = rs.getInt("id");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return id;
    }
    public Pelicula datosPelicula (int idPelicula)
    {
        Pelicula peli = null;
        try
        {
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM peliculas WHERE id = '" + idPelicula + "';";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next())
            {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                int anno = rs.getInt("anno");
                boolean tieneOscar = rs.getBoolean("tieneOscar");
                double valoracion = rs.getDouble("valoracion");
                peli = new Pelicula(id, titulo, anno, tieneOscar, valoracion);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return peli;
    }
    public Actor datosActor (int idActor)
    {
        Actor actor = null;
        try
        {
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM actores WHERE id = '" + idActor + "';";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next())
            {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                LocalDate fecha = LocalDate.parse(rs.getString("fechaNacimiento"));
                actor = new Actor(id, nombre, fecha);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return actor;
    }
    public List<Pelicula> listadoPeliculas ()
    {
        List<Pelicula> lPelis = new ArrayList<>();
        try
        {
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM peliculas;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                int anno = rs.getInt("anno");
                boolean tieneOscar = rs.getBoolean("tieneOscar");
                double valoracion = rs.getDouble("valoracion");
                Pelicula peli = new Pelicula(id, titulo, anno, tieneOscar, valoracion);
                lPelis.add(peli);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return lPelis;
    }
    public List<Actor> listadoActores ()
    {
        List<Actor> lActores = new ArrayList<>();
        try
        {
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM actores WHERE id;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                LocalDate fecha = LocalDate.parse(rs.getString("fechaNacimiento"));
                Actor actor = new Actor(id, nombre, fecha);
                lActores.add(actor);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return lActores;
    }
    public List<Pelicula> listadoPeliculaPorActores (int idActor)
    {
        List<Pelicula> lPelis = new ArrayList<>();
        try
        {
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM peliculas JOIN actoresPeliculas ON " +
                    "peliculas.id = actoresPeliculas.idPelicula WHERE actoresPeliculas.idActor = '" + idActor + "';";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                int anno = rs.getInt("anno");
                boolean tieneOscar = rs.getBoolean("tieneOscar");
                double valoracion = rs.getDouble("valoracion");
                Pelicula peli = new Pelicula(id, titulo, anno, tieneOscar, valoracion);
                lPelis.add(peli);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return lPelis;
    }
    public List<ActorPelicula> listadoActoresPorPelicula (int idPelicula)
    {
        List<ActorPelicula> actorPeli = new ArrayList<>();
        try
        {
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM actores JOIN actoresPeliculas ON " +
                    "actores.id = actoresPeliculas.idActor WHERE actoresPeliculas.idPelicula = '" + idPelicula + "'" +
                    " ORDER BY actoresPeliculas.principal DESC, actores.id;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                LocalDate fechaNacimiento = LocalDate.parse(rs.getString("fechaNacimiento"));
                boolean principal = rs.getBoolean("principal");

                ActorPelicula actorPelicula = new ActorPelicula(id, nombre, fechaNacimiento, principal);
                actorPeli.add(actorPelicula);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return actorPeli;
    }
}