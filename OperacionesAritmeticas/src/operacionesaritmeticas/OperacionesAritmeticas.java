package operacionesaritmeticas;

import java.util.Scanner;

/**
 *
 * @author Luis Garcia
 */
public class OperacionesAritmeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2, resultado;
        //int num2;
        //int resultado;
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
        resultado = num1 + num2;
        System.out.println("Resultado: "+resultado);
        System.out.println("Resultado2: "+(num1+num2));
    }
    
}
