package ejercicio1;

public class ClienteServicio {
    public double calcularDeuda(Cliente cli) {
        return cli.deuda*1.19;
    }
    public void mostrarCliente(Cliente cli) {
        System.out.println("El nombre del cliente es :"+cli.nombre);
        System.out.println("El rut del cliente es :"+cli.rut);
    }

}
