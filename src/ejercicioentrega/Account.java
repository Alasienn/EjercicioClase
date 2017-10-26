/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioentrega;


public class Account {
    private int id;
    private double credit;
    private Client owner;

    public Account(int id, double credit, Client owner) {
        this.id = id;
        this.credit = credit;
        this.owner=owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
    
    

}
