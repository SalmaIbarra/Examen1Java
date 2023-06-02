package com.example.examen1java;

public class CuentaBanco {

    public int numCuenta;
    public String Nombre;
    public String Banco;
    public float saldo;

    public CuentaBanco(int numCuenta, String Nombre, String Banco, float saldo) {
        this.numCuenta = numCuenta;
        this.Nombre = Nombre;
        this.Banco = Banco;
        this.saldo = saldo;
    }
    public int getNumCuenta() {
        return numCuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getBanco() {
        return Banco;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float cantidad) {
        saldo += cantidad;
    }

    public boolean retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }
}
