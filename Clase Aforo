class Aforo {
    private int aforoMaximo = 100;
    private int clientesActuales = 0;

    public void agregarCliente() {
        if (clientesActuales < aforoMaximo) {
            clientesActuales++;
            System.out.println("Clientes agregado. total de clientes" + clientesActuales);
        } else {
            System.out.println("No se puede agregar mas clientes, Aforo maximo alcado");
        }
    }

    public void removerCliente() {
        if (clientesActuales > 0) {
            clientesActuales--;
            System.out.println("Clientes removidos, total de clientes" + clientesActuales);
        } else {
            System.out.println("No hay clientes para remover");
        }
    }
}

