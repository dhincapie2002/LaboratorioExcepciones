//exepcion para cuando una letra se quiere almacenar en un entero
package laboratorio;

/**
 *
 * @author dshc-
 */
public class NumFormatExcep {

    public static void main(String[] args) {
        try {
            /*se declara e instancia una variable i 
            se intenta parcear una cadena de texto a int
            la cadena tiene una letra, por lo que genera error de tipo “NumberFormatException”
            */
            int i = Integer.parseInt("123A4"); 
            /*sentencia para el error de tipo “NumberFormatException”
            */
            } catch (NumberFormatException nfe) {
            System.out.println("El formato del numero es erroneo");
        }
    }
}
