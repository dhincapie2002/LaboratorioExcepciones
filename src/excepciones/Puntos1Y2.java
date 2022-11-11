//desarrollo puntos 1 y 2
package excepciones;

/**
 *
 * @author dshc-
 */
public class Puntos1Y2 {
//metodo main para dar inicio al porgrama
    public static void main(String args[]) {
        formatoNumero();
    }


    public static void formatoNumero() {
        //instanciar la variable de tipo int
        int numero;
        //instanciar y declarar variable de tipo cadena
        String cadena = "  1";
        try {
            //paciar de cadena a entero
            numero = Integer.parseInt(cadena);
        } catch (NumberFormatException ex) {
            //mensaje relacionado a la execcion por hacer un mal parceo
            System.out.println("No es un número, es una cadena de texto. \n" + ex.getMessage());
        }
    }
}
