
package com.company.principal;


public class Mesa {
      private int id;
    private int capacidad;
    private boolean estaDisponible;

    public Mesa(int id, int capacidad, boolean estaDisponible) {
        this.id = id;
        this.capacidad = capacidad;
        this.estaDisponible = estaDisponible;
    }
    public void reservarMesa(){
        if(estaDisponible){
            estaDisponible= false;
        }else {
            System.out.println("La mesa no ésta Disponible");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    @Override
    public String toString() {
        return "Mesa{" + "id=" + id + ", capacidad=" + capacidad + ", estaDisponible=" + estaDisponible + '}';
    }
    
    
}
