package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClinicaVeterinaria
{
    private List<Animal> listaAnimales;

    public ClinicaVeterinaria() {listaAnimales = new ArrayList<>();}

    public void insertaAnimal(Animal animal) {listaAnimales.add(animal);}
    public Animal buscaAnimal(String nombre)
    {
        Animal animal = null;
        int i;
        for (i = 0; i < listaAnimales.size(); i++)
        {
            if (listaAnimales.get(i).getNombre().equals(nombre))
            {
                animal = listaAnimales.get(i);
            }
        }
        return animal;
    }
    public void modificaComentarioAnimal(String nombre, String comentario)
    {
        int i;
        for (i = 0; i < listaAnimales.size(); i++)
        {
            if (listaAnimales.get(i).getNombre().equals(nombre))
            {
                listaAnimales.get(i).setComentarios(comentario);
            }
        }
    }
    public void ordenaLista()
    {
        Collections.sort(listaAnimales);
    }

    @Override
    public String toString()
    {
        String fichas = "";
        int i;
        for (i = 0; i < listaAnimales.size(); i++)
        {
            fichas += listaAnimales.get(i).toString();
            if (i != listaAnimales.size()-1)
            {
                fichas += "\u001B[36m" + "\n" + "------------------------------------------" + "\u001B[0m" + "\n";
            }
        }
        return fichas;
    }
}