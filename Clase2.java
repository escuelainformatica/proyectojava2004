public class Clase2 {

    public static String campo="valor del campo";
    public static void main(String args[]) {
        int numero1=1;
        int numero2=2;
        // + , - , *, /, %
        int sumar;
        sumar=numero1+numero2; //+(222+444)*3;

        // llamando a una funcion
        //System.out.println(sumar);
        mifuncion(sumar);
    }

    public static void mifuncion(int numero) {
        int numero1=22;
        System.out.print("el numero es: "+numero+" y el campo es "+campo);
    }
}
