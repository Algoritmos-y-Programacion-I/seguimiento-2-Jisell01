package model;

public class Cliente {
    private String nombre;
    private String cedula;
    private int edad;
    private TipoCuenta cuenta;


    public Cliente(String nombre, String cedula, int edad, TipoPokemon cuenta) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoCedula getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int Edad) {
        this.edad = edad;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getCuenta() {
        return cuenta;
    }


}
