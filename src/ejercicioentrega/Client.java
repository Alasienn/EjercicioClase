/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioentrega;

import java.util.ArrayList;

public class Client extends Person {

    private Manager manager;
    private ArrayList<Account> accounts;

    public Client(String name) {
        super(name);
        this.manager = manager;
        this.accounts = new ArrayList<>();
    }

    //Nueva Cuenta
    public boolean addAccount(Account account) {
        Account newAccount = null;
        try {
            newAccount = account;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return this.accounts.add(newAccount);
    }

    @Override
    public String toString() {
        return "Cliente:    " + super.toString() + "|| Manager=" + manager + "|| Cuentas=" + accounts.size();
    }

}
