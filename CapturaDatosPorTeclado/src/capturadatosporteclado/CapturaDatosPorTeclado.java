package capturadatosporteclado;

import java.util.Scanner;

/**
 *
 * @author Luis Garcia
 */
public class CapturaDatosPorTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.println("Escriba su primer nombre");
        //nombre = leer.next();
        nombre = leer.nextLine();// no funciona bien en ciclos
        System.out.println("Digite su edad");
        edad = leer.nextInt();
        
        System.out.println("Su nombre es "+nombre+
                " y su edad es de "+edad+" años");
    }
    
}
