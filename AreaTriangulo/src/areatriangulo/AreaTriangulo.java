/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areatriangulo;

import java.util.Scanner;

/**
 *
 * @author Luis Garcia
 */
public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double b, h, a;
        System.out.println("ingrese la base");
        b = leer.nextDouble();
        System.out.println("ingrese la altura");
        h = leer.nextDouble();
        a=(b*h)/2;
        System.out.println("Area: "+a);
    }
    
}
