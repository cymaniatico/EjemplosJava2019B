/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liquidacionempresa;

import java.util.Scanner;

/**
 *
 * @author cymaniatico
 */
public class LiquidacionEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
    int n,dias,vhora,nhoras;
    double totaltrabajador=0,totalempresa=0;    
    System.out.println("Digite numero de trabajadores");
        n=leer.nextInt();
    for(int i=1;i<=n;i++){
        System.out.println("Digite numero de dias trabajados por el trabajador "+i);
        dias=leer.nextInt();
        System.out.println("Digite el valor de la hora del trabajador "+i);
        vhora=leer.nextInt();
        for(int j=1;j<=dias;j++){
            System.out.println("Cuantas horas trabajo el trabajador "+i+" en el dia "+j);
            nhoras=leer.nextInt();
            totaltrabajador+=(nhoras*vhora);
            totalempresa+=(nhoras*vhora);
        }
        System.out.println("trabajador "+i+"su sueldo es de "+totaltrabajador);
        totaltrabajador=0;
    }    
        System.out.println("El total que pagó la empresa es de "+totalempresa);
    }
    
}
