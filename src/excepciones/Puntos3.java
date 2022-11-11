//desarrollo puntos 3
package excepciones;

/**
 *
 * @author dshc-
 */
public class Puntos3 {
//metodo main para dar inicio al porgrama
    public static void main(String args[]) {
        desborde();
    }

    public static void desborde() {
        //instancia del vector
        int v[] = new int[3];
        try {
            //recorrido del vector
            for (int i = 0; i < 5; i++) {
                //declaracion del vector
                v[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException aib) {
            //excepcion dada porque se intenta recorrer 4 pociciones de un vector que solo tiene 3
            System.out.println("El total del recorrido es puperior a las casillas del arreglo. \n"+"El arreglo es de tamaño: "+aib.getMessage());
        }
    }
}
