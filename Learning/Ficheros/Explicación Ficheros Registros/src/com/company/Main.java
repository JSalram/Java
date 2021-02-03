package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        CuentaBanco cb = new CuentaBanco();

        cb.numeroCuenta = "ES64683216844646";
        cb.propietario = "Manuel Martínez Fernández";
        cb.saldo = 1982.25;
        cb.bloqueada = false;

        List<CuentaBanco> listaBanco = new ArrayList<>();

        listaBanco.add(cb);
    }
}