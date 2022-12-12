
package com.mycompany.ejc1if;

import java.util.Scanner;


public class Ejc1if {

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Ingrese un Sueldo");
        int sueldo = v.nextInt();
        if(sueldo>3000){
            System.out.println("Paga impuestos");
        }else{
            System.out.println("No paga impuestos");
        }
        
    }
}
