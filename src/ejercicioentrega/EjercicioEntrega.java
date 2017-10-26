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

        //Creacion Banco
        System.out.print("Bienvenido!, Ingrese el nombre del Banco.  :  ");
        Scanner sc = new Scanner(System.in);
        String nombanc = sc.next();
        Bank b = new Bank(nombanc);

        //Menu
        System.out.println("  .:MENU:.");
        System.out.println("1.Crear Manager");
        System.out.println("2.Crear Cliente");
        System.out.println("3.Crear Cuenta");
        System.out.println("4.Info de Cuentas");
        int op;
        while (true) {
            System.out.println("a que funcion desea acceder ");
            try {
                Scanner entrada = new Scanner(System.in);
                op = entrada.nextInt();
                switch (op) {
                    case (1):
                        System.out.print("Ingrese el nombre del nuevo funcionario: ");
                        String nombrem = entrada.next();
                        b.newManager(nombrem);
                        break;
                    case (2):
                        System.out.print("Ingrese el nombre del nuevo cliente: ");
                        String nombrec = entrada.next();
                        Client clienten = new Client(nombrec);
                        b.newClient(nombrec);
                        break;
                    case (3):
                        System.out.print("Ingrese el ID de la cuenta: ");
                        int id = entrada.nextInt();
                        System.out.print("Ingrese el saldo de la cuenta: ");
                        double saldo = entrada.nextDouble();
                        System.out.print("Ingrese el nombre del cliente: ");
                        String nombrec2 = entrada.next();
                        clienten = new Client(nombrec2);
                        b.addAccount(id, saldo, clienten);                        
                        break;
                    case (4):
                        System.out.println(b.toString());
                        break;
                }
            } catch (Exception e) {
                System.out.println("Opcion invalida");
            }
        }
    }

}
