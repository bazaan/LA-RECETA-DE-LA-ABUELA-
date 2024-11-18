import java.util.Scanner;

public class Program{

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        Scanner scanner = new Scanner(System.in);

         while (true) {
                System.out.println("\nOpciones:");
                System.out.println("1. Mostrar menú");
                System.out.println("2. Tomar pedido");
                System.out.println("3. Evaluar meta diaria");
                System.out.println("4. Salir");
                System.out.print("Elija una opción: ");
                
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del salto de línea
                
                switch (opcion) {
                    case 1:
                        restaurante.mostrarMenu();
                        break;
                    case 2:
                        restaurante.tomarPedido();
                        break;
                    case 3:
                        restaurante.evaluarMetaDiaria();
                        break;
                    case 4:
                        System.out.println("Gracias por usar el sistema del restaurante. ¡Hasta luego!");
                        return;  // Salir del programa
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            }
    }
}