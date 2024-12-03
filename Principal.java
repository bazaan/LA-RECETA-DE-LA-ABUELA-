
package com.company.principal;


import javax.swing.*;
import java.sql.Date;
import java.sql.Time;
public class Principal {

    public static void main(String[] args) {
         Restaurante restaurante = new Restaurante(1, "Restaurante El Buen Sabor", "Calle Falsa 123");
         
          int opcion = 0;
        String menu = " MENU\n"
                + "1.  Hacer Reserva\n"
                + "2. Cancelar Reserva\n"
                + "3. Reportar Reservas\n"
                + "4. Salir\n\n"
                + "Ingrese opción:";
         while (opcion != 4) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:
                  int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la reserva:"));
                    String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
                    String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del cliente:");
                    String correo = JOptionPane.showInputDialog("Ingrese el correo electrónico del cliente:");
                    Date fecha = Date.valueOf(JOptionPane.showInputDialog("Ingrese la fecha de la reserva (YYYY-MM-DD):"));
                    Time hora = Time.valueOf(JOptionPane.showInputDialog("Ingrese la hora de la reserva (HH:MM:SS):"));
                    int numeroMesa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de mesa:"));
                    String estadoReserva = JOptionPane.showInputDialog("Ingrese el estado de la reserva:");
                    Cliente cliente = new Cliente(id, nombreCliente, telefono, correo,id);
                    Reserva reserva = new Reserva(id, cliente, fecha, hora, numeroMesa, estadoReserva);
                    restaurante.hacerReserva(reserva);
                    break;
                case 2:
                     id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la reserva a cancelar:"));
                    restaurante.cancelarReserva(id);
                    break;
                case 3:
                     JOptionPane.showMessageDialog(null, restaurante.reportarReservas());
                    break;
                case 4:
                     break;
                     default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
    }
}
    }
}

