import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Restaurante {
    private Map<Integer, Plato> menu;
    private double totalGanancias;

    private class Plato {
        String nombre;
        double precio;

        public Plato(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }
    }
    public Restaurante() {
        menu = new HashMap<>();
        totalGanancias = 0.0;
        inicializarMenu();
 
    }
    
    public void mostrarMenu() {
        System.out.println("Menu del Restaurante:");
        for (Map.Entry<Integer, Plato> entry : menu.entrySet()) {
            int codigo = entry.getKey();
            Plato plato = entry.getValue();
            System.out.printf("%d. %s - S/ %.2f\n", codigo, plato.nombre, plato.precio);
        }
    }
    private void inicializarMenu(){
        menu.put(1, new Plato("Plato Estrella", 30.0));
        menu.put(2, new Plato("Lomo Saltado", 25.0));
        menu.put(3, new Plato("Ceviche Mixto", 28.0));
        menu.put(4, new Plato("Pollo a la Brasa", 22.0));
        menu.put(5, new Plato("Arroz con Pollo", 18.0));
        menu.put(6, new Plato("Tallarines Verdes", 20.0));
        menu.put(7, new Plato("Seco de Res", 26.0));
        menu.put(8, new Plato("Chaufa Especial", 19.0));
        menu.put(9, new Plato("Sopa Criolla", 15.0));
        menu.put(10, new Plato("Anticuchos", 17.0));
        menu.put(11, new Plato("Papa a la Huancaina", 14.0));
        menu.put(12, new Plato("Aji de Gallina", 21.0));
        menu.put(13, new Plato("Causa Limena", 16.0));
        menu.put(14, new Plato("Rocoto Relleno", 27.0));
        menu.put(15, new Plato("Chicharron", 23.0));
        menu.put(16, new Plato("Tacu Tacu", 24.0));
        menu.put(17, new Plato("Carapulcra", 18.0));
        menu.put(18, new Plato("Leche de Tigre", 12.0));
        menu.put(19, new Plato("Pescado Frito", 20.0));
        menu.put(20, new Plato("Arroz Chaufa de Mariscos", 29.0));
    }

    public void tomarPedido(){
        Scanner scanner = new Scanner(System.in);
        double totalPedido = 0.0;

        System.out.println("\nIngrese el código del plato que desea pedir. Escriba '0' para finalizar su pedido.");

        while (true) {
            System.out.print("Código del plato: ");
            int codigo = scanner.nextInt();

            if (codigo == 0) {
                break;
            }

            if (menu.containsKey(codigo)) {
                Plato plato = menu.get(codigo);
                totalPedido += plato.precio;
                System.out.printf("Agregado: %s - S/ %.2f\n", plato.nombre, plato.precio);
            } else {
                System.out.println("Código no válido. Por favor, intente nuevamente.");
            }
        }

        totalGanancias += totalPedido;
        System.out.printf("Total del pedido: S/ %.2f\n", totalPedido);
    }

    public void evaluarMetaDiaria() {
        System.out.printf("\nGanancias del día: S/ %.2f\n", totalGanancias);
        if (totalGanancias >= 1000.0) {
            System.out.println("¡Se ha superado la meta diaria!");
        } else {
            System.out.println("No se superó la ganancia del día.");
        }
    }
}
