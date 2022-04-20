public class Clase3 {    
    public static void main(String args[]) {
        // tipos de variables primitivas
        String rut="1111-1";
        String nombre="John";
        int edad=333;
        String correo="aaa@bbb.com";

        // variable (objeto)
        Cliente cli=new Cliente();
        cli.nombre="john";
        cli.rut="222-2";
        cli.edad=33;
        cli.deuda=1000;
        cli.correo="aaaa@bbb.com";

        // 
        ClienteServicio clisrv=new ClienteServicio();
        clisrv.mostrarCliente(cli);

        System.out.println(clisrv.calcularDeuda(cli));
  

    }
}
