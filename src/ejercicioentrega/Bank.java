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
        Account account = new Account(0, 0, dueno);
        return this.accounts.add(account);
    }

    //Genera Manager
    public boolean newManager(String name) {
        Manager manager = new Manager(name);
        if (this.managers.add(manager)) {
            return true;
        } else {
            return false;
        }
    }

//Genera Cliente
    public boolean newClient(String name) {
        Client client = new Client(name);
        if (this.clients.add(client)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return ".:Banco " + name + ";." + "\n" + "Cantidad de cuentas existentes:" + accounts + "\n" + ", Managers:" + managers.size() + "\n" + "Clients=" + clients.size();
    }
}
