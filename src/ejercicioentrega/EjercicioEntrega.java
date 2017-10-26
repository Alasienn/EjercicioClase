/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioentrega;

import java.util.Scanner;

public class EjercicioEntrega {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombanc = sc.next();
        Bank b = new Bank(nombanc);
    }
    
}
