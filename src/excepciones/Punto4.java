//desarrollo puntos 4
package excepciones;

/**
 *
 * @author dshc-
 */
public class Punto4 {
//metodo main para dar inicio al porgrama

    public static void main(String args[]) {
        aritmetico();
    }

    public static void aritmetico() {
        //instanciar y declarar variable de tipo entero
        //instanciar variable de tipo entero
        int numero = 5, resultado;
        try {
            //realizar una operacion de divicion
            resultado = numero / 0;
        } catch (ArithmeticException arit) {
            //crear la excepcion necesaria para el caso de que se genere un error de "ArithmeticException"
            System.out.println("No se puede realizar la divicion. \n" + arit.getMessage());
        }
    }
}
