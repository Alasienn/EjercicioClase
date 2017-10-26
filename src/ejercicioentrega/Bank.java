/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioentrega;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Account> accounts;
    private ArrayList<Manager> managers;
    private ArrayList<Client> clients;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
        this.managers = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Nueva Cuenta
    public boolean addAccount(int id, double credit, Client dueno) {
        Account account = null;
        try {
            account = new Account(id, credit, dueno);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return this.accounts.add(account);
    }

    //Genera Manager
    public boolean newManager(String name) {
        Manager manager = null;
        try {
            manager = new Manager(name);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return this.managers.add(manager);
    }

    //Genera Cliente
    public boolean newClient(String name) {
        Client client = null;
        try {
            client = new Client(name);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return this.clients.add(client);
    }

    @Override
    public String toString() {
        return ".:Banco " + name + ";." + "\n" + "Cantidad de cuentas existentes:" + accounts + "\n" + ", Managers:" + managers.size() + "\n" + "Clients=" + clients.size();
    }
}
