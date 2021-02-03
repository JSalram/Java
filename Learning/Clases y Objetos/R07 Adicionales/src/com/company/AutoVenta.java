package com.company;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AutoVenta
{
    private List<Coche> listaCoches;

    public AutoVenta() {listaCoches = new ArrayList<>();}
    public void add(Coche c) {listaCoches.add(c);}

    public void cargar (String fichero)
    {
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            while (linea != null)
            {
                String matricula = linea.split(",")[0];
                int anyo = Integer.parseInt(linea.split(",")[1].split("-")[0]);
                int mes = Integer.parseInt(linea.split(",")[1].split("-")[1]);
                int dia = Integer.parseInt(linea.split(",")[1].split("-")[2]);
                LocalDate fechaMatriculacion = LocalDate.of(anyo, mes, dia);
                String marca = linea.split(",")[2];
                String modelo = linea.split(",")[3];
                double precio = Double.parseDouble(linea.split(",")[4]);

                Coche c = new Coche(matricula, fechaMatriculacion, marca, modelo, precio);
                listaCoches.add(c);

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
    public void guardar(String fichero)
    {
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            int i;
            for (i = 0; i < listaCoches.size(); i++)
            {
                bw.write(listaCoches.get(i).getMatricula() + ",");
                bw.write(String.valueOf(listaCoches.get(i).getFechaMatriculacion()) + ",");
                bw.write(listaCoches.get(i).getMarca() + ",");
                bw.write(listaCoches.get(i).getModelo() + ",");
                bw.write(String.valueOf(listaCoches.get(i).getPrecio()) + "\n");
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void buscaCoche (String matricula)
    {
        int i;
        for (i = 0; i < listaCoches.size(); i++)
        {
            if (listaCoches.get(i).getMatricula().equals(matricula))
            {
                System.out.println(listaCoches.get(i).toString());
            }
        }
    }
    public String espaciado(int tipo, int espacios)
    {
        StringBuilder s = new StringBuilder();
        int i, esp = 0, max = 0;
        switch (tipo)
        {
            case 1:
            {
                for (i = 0; i < listaCoches.size(); i++)
                {
                    esp = listaCoches.get(i).getMarca().length();
                    if (esp > max)
                    {
                        max = esp;
                    }
                }

                for (i = 0; i < max - espacios; i++)
                {
                    s.append(" ");
                }

                return s.toString();
            }
            case 2:
            {
                for (i = 0; i < listaCoches.size(); i++)
                {
                    esp = listaCoches.get(i).getModelo().length();
                    if (esp > max)
                    {
                        max = esp;
                    }
                }

                for (i = 0; i < max - espacios; i++)
                {
                    s.append(" ");
                }

                return s.toString();
            }
            case 3:
            {
                for (i = 0; i < listaCoches.size(); i++)
                {
                    if (String.valueOf(listaCoches.get(i).getPrecio()).length() > 5)
                    {
                        esp += 5 - String.valueOf(listaCoches.get(i).getPrecio()).length();
                    }
                    else
                    {
                        esp += String.valueOf(listaCoches.get(i).getPrecio()).length() - 5;
                    }

                    if (esp > max)
                    {
                        max = esp;
                    }
                }

                for (i = 0; i < max; i++)
                {
                    s.append(" ");
                }
                for (i = 0; i < espacios; i++)
                {
                    s.append(" ");
                }

                return s.toString();
            }
            case 4:
            {
                for (i = 0; i < espacios; i++)
                {
                    s.append(" ");
                }

                return s.toString();
            }
            default:
                return null;
        }
    }

    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        s.append("Matrícula");
        s.append(espaciado(4, 5));
        s.append("Marca");
        s.append(espaciado(1, 0));
        s.append("Modelo");
        s.append(espaciado(2, 1));
        s.append("Fecha Matr.");
        s.append(espaciado(4, 5)).append(espaciado(3, 0));
        s.append("Precio" + "\n");
        int i;
        for (i = 0; i < listaCoches.size(); i++)
        {
            s.append(listaCoches.get(i).getMatricula());
            s.append(espaciado(4, 7));
            s.append(listaCoches.get(i).getMarca());
            s.append(espaciado(1, listaCoches.get(i).getMarca().length() - 5));
            s.append(listaCoches.get(i).getModelo());
            s.append(espaciado(2, listaCoches.get(i).getModelo().length() - 5));
            s.append(listaCoches.get(i).getFechaMatriculacion().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            s.append(espaciado(4, 6));
            s.append(espaciado(3, 0));
            s.append(listaCoches.get(i).getPrecio());
            if (i != listaCoches.size()-1)
            {
                s.append("\n");
            }
        }

        return s.toString();
    }
}
