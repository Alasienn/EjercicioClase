/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioentrega;

import java.util.ArrayList;

public class Manager extends Person {
    
    private ArrayList<Client> clients;
    
    public Manager(String name) {
        super(name);
        this.clients = new ArrayList<>();
    }
    
    
    public boolean newClient(String name){
        Client client = new Client(name);
        if(this.clients.add(client))
            return true;
        else
            return false;
    }
    
}