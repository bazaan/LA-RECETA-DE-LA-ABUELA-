
package com.company.principal;


public class Cliente {
    private int dni;
    private String nombre;
    private String telefono;
    private String correo;
     private int cantidadgente;

    public Cliente(int dni, String nombre, String telefono, String correo, int cantidadgente) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.cantidadgente = cantidadgente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCantidadgente() {
        return cantidadgente;
    }

    public void setCantidadgente(int cantidadgente) {
        this.cantidadgente = cantidadgente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + ", cantidadgente=" + cantidadgente + '}';
    }
     
     
}
