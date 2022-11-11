/*
5.Cree un programa que lea un entero y lea un divisor,  
realice la división mostrando los números leídos y el resultado, 
haga diversas pruebas como  ingresar valores tipo texto y dividir por 0, 
trate las excepciones generadas.  

Cree una excepción propia cuando el entero sea menor que 10  (use if …throw new), y trátela.
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dshc-
 */
public class Punto5 {
//main que ejecuta el metodo 

    public static void main(String args[]) {
        dividir();
    }
// metodo para poder leer en dividendo

    public static int leerEntero() {
        //declaracion e instanciacion de la variable necesaria para almanenar el dato capturado
        int entero = 0;
        //creacion del objeto para poder recivir los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("___________Tenga en cuenta que el numero debe ser mayor a 10___________");
        //inicio del ciclo para que cada vez que el numero no corresponda se vuelva a solicitar
        do {
            try {
                //solicitud, creacion y almacenamiento del dato
                entero = 0;
                System.out.print("Digite el entero: ");
                entero = sc.nextInt();
                if (entero <= 10) {
                    throw new NumberFormatException("El divisor debe ser un numero mayor a 10");
                }
                //caso de excepcion para cuando el dato tienen un herror de tipo NumberFormatException
            } catch (NumberFormatException nfe) {
                System.out.println("<<<El dividendo no es valido. (" + nfe.getMessage() + ")>>>");
                //caso de excepcion para cuando el dato tienen un herror de tipo InputMismatchException
            } catch (InputMismatchException in) {
                //hacer que la variable sea igual a 0 dado el caso y el numero sea erroneo
                entero = 0;
                System.out.println("<<<Hay caracteres invalidos (" + in.getMessage() + ")>>>");
                //terminar la excepcion para que no genere un ciclo repetitivo
                break;
            }
            //fin del ciclo do while, para que se cumpla la condicion de que el numero sea <=10
        } while (entero <= 10);
        //retornar la varaible capturada
        return entero;
    }
// metodo para poder leer en divisor

    public static int leerDividendo() {
        //declaracion e instanciacion de la variable necesaria para almanenar el dato capturado
        int divisor = 0;
        //creacion del objeto para poder recivir los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("___________Tenga en cuenta que el numero debe ser diferente a 0___________");
        //inicio del ciclo para que cada vez que el numero no corresponda se vuelva a solicitar
        do {
            try {
                //solicitud, creacion y almacenamiento del dato
                divisor = 0;
                System.out.print("Digite el divisor: ");
                divisor = sc.nextInt();
                if (divisor == 0) {
                    throw new NumberFormatException("El divisor debe ser un numero diferente a 0");
                }
                //caso de excepcion para cuando el dato tienen un herror de tipo NumberFormatException
            } catch (NumberFormatException nfe) {
                System.out.println("<<<El divisor es diferente a un numero. (" + nfe.getMessage() + ")>>>");
                //caso de excepcion para cuando el dato tienen un herror de tipo InputMismatchException
            } catch (InputMismatchException in) {
                //hacer que la variable sea igual a 0 dado el caso y el numero sea erroneo
                divisor = 0;
                System.out.println("<<<Hay caracteres. (" + in.getMessage() + ")>>>");
                //terminar la excepcion para que no genere un ciclo repetitivo
                break;
            }
            //fin del ciclo do while, para que se cumpla la condicion de que el numero sea diferente a 0
        } while (divisor == 0);
        //retornar la varaible capturada
        return divisor;
    }
//metodo para generar la divicion e imprimir la respuesta

    public static void dividir() {
        //inicializacion e instanciacion de la variable con la respuesta
        float rta = 0;
        //inicializacion e instanciacion de la variable igualada a el metodo para obtener el numero entero
        float a = leerEntero();
        //inicializacion e instanciacion de la variable igualada a el metodo para obtener el dividendo
        float b = leerDividendo();
        try {
            //divicion
            rta = a / b;
            //caso de excepcionpara error de tipo ArithmeticException
        } catch (ArithmeticException ex) {
            System.out.println("La divicion no es posible. (" + ex.getMessage() + ")");
        }
        //alamcenar todo el formato de respuesta en una variable de tipo cadena
        String rtaTotal = "-El entero es: " + a + "\n-El dividendo es: " + b + "\n-El resultado de la divicion es: " + rta;
        //mostrar la cadena con la respuesta
        System.out.println("\n" + rtaTotal);
    }
}
