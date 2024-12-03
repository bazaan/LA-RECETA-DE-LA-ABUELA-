
package com.company.principal;

import java.util.Hashtable;
public class Restaurante {
    
    private int id;
    private String nombre;
    private String direccion;
    private Hashtable<Integer, Reserva> reservas;
    private Hashtable<Integer, Mesa> mesas;

    public Restaurante(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.reservas = new Hashtable<>();
        this.mesas = new Hashtable<>() ;
    }
    public void agregarMesa(Mesa mesa) {
        mesas.put(mesa.getId(), mesa);
    }
     public void hacerReserva(Reserva reserva) {
        reservas.put(reserva.getId(), reserva);
    }

    public void cancelarReserva(int idReserva) {
        Reserva reserva = reservas.get(idReserva);
        if (reserva != null) {
            reserva.cancelarReserva();
        }
    }

    public String reportarReservas() {
        StringBuilder reporte = new StringBuilder();
        for (Reserva reserva : reservas.values()) {
            reporte.append(reserva.toString()).append("\n");
        }
        return reporte.toString();
    }
    
}
