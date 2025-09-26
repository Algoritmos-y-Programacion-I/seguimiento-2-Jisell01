package model;

public class Cuenta {

    public static final String AHORROS = "AHORROS";
    public static final String CORRIENTE = "CORRIENTE";

    private String nombreBanco;
    private String tipoCuenta; // AHORROS o CORRIENTE
    private double saldo;

    public Cuenta(String nombreBanco, String tipoCuenta, double saldo) {
        this.nombreBanco = nombreBanco;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Banco: " + nombreBanco + ", Tipo: " + tipoCuenta + ", Saldo: $" + saldo;
    }
}

