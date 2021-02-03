package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Pokedex
{
    private List<Pokemon> listaPokemon;

    public Pokedex () {listaPokemon = new ArrayList<>();}
    public Pokedex (String fichero)
    {
        listaPokemon = new ArrayList<>();
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            while (linea != null)
            {
                String[] pokemon = linea.split(",");
                Pokemon p = new Pokemon(Integer.parseInt(pokemon[0]), pokemon[1], pokemon[2],
                        Integer.parseInt(pokemon[3]), Integer.parseInt(pokemon[4]), Integer.parseInt(pokemon[5]),
                        Integer.parseInt(pokemon[6]), Integer.parseInt(pokemon[7]), Integer.parseInt(pokemon[8]),
                        pokemon[9], Boolean.parseBoolean(pokemon[10]));
                listaPokemon.add(p);
                linea = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void leeCSV (String fichero)
    {
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            int i = 0;
            while (linea != null)
            {
                String[] pokemon = linea.split(",");
                Pokemon p = new Pokemon(Integer.parseInt(pokemon[0]), pokemon[1], pokemon[2],
                        Integer.parseInt(pokemon[3]), Integer.parseInt(pokemon[4]), Integer.parseInt(pokemon[5]),
                        Integer.parseInt(pokemon[6]), Integer.parseInt(pokemon[7]), Integer.parseInt(pokemon[8]),
                        pokemon[9], Boolean.parseBoolean(pokemon[10]));
                listaPokemon.add(p);
                i++;
                linea = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void cargaCSV (String fichero)
    {
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            String linea = "";
            int i;
            for (i = 0; i < listaPokemon.size(); i++)
            {
                Pokemon p = listaPokemon.get(i);
                linea = String.valueOf(p.getId()) + "," + p.getNombre() + "," + p.getTipo() +
                        String.valueOf(p.getAtaque()) + "," + String.valueOf(p.getDefensa()) + "," +
                        String.valueOf(p.getVida()) + "," + String.valueOf(p.getAtaqueespecial()) + "," +
                        String.valueOf(p.getDefensaespecial()) + "," + String.valueOf(p.getVelocidad()) + "," +
                        p.getHabilidad() + "," + String.valueOf(p.getCapturado());
                linea += "\n";
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void capturaPokemon (String nombre)
    {
        int i;
        for (i = 0; i < listaPokemon.size(); i++)
        {
            if (listaPokemon.get(i).getNombre().equals(nombre))
            {
                listaPokemon.get(i).setCapturado(true);
            }
        }
    }
    public double porcentajeCapturas ()
    {
        int i, capturados = 0;
        for (i = 0; i < listaPokemon.size(); i++)
        {
            if (listaPokemon.get(i).getCapturado())
            {
                capturados++;
            }
        }
        return (double) listaPokemon.size() / capturados;
    }
    public Pokemon buscaPokemon (int id)
    {
        Pokemon p = new Pokemon(-1, null, null, -1, -1, -1,
            -1, -1, -1, null, false);;
        int i;
        for (i = 0; i < listaPokemon.size(); i++)
        {
            if (listaPokemon.get(i).getId() == id)
            {
                p = listaPokemon.get(i);
            }
        }
        return p;
    }
    public Pokemon buscaPokemon (String nombre)
    {
        Pokemon p = new Pokemon(-1, null, null, -1, -1, -1,
                -1, -1, -1, null, false);;
        int i;
        for (i = 0; i < listaPokemon.size(); i++)
        {
            if (listaPokemon.get(i).getNombre().equals(nombre))
            {
                p = listaPokemon.get(i);
            }
        }
        return p;
    }
    public String listadoPokemon ()
    {
        String pokemon = "";
        int i;
        for (i = 0; i < listaPokemon.size(); i++)
        {
            pokemon += listaPokemon.get(i).toString();
            pokemon += "\n";
        }
        return pokemon;
    }
    public String listadoPokemonCapturados ()
    {
        String pokemon = "";
        int i;
        for (i = 0; i < listaPokemon.size(); i++)
        {
            if (listaPokemon.get(i).getCapturado())
            {
                pokemon += listaPokemon.get(i).toString();
                pokemon += "\n";
            }
        }
        return pokemon;
    }
    public String listadoPokemonTipo (String tipo)
    {
        String pokemon = "";
        int i;
        for (i = 0; i < listaPokemon.size(); i++)
        {
            if (listaPokemon.get(i).getTipo().equals(tipo))
            {
                pokemon += listaPokemon.get(i).toString();
                pokemon += "\n";
            }
        }
        return pokemon;
    }
    public String listadoPokemonCapturadosTipo (String tipo)
    {
        String pokemon = "";
        int i;
        for (i = 0; i < listaPokemon.size(); i++)
        {
            if (listaPokemon.get(i).getCapturado() && listaPokemon.get(i).getTipo().equals(tipo))
            {
                pokemon += listaPokemon.get(i).toString();
                pokemon += "\n";
            }
        }
        return pokemon;
    }

}
