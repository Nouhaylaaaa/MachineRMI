/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientg4;

import dao.IDao;
import entity.Machine;
import entity.Salle;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {
        try {
            IDao<Machine> machineDao = (IDao<Machine>) Naming.lookup("rmi://localhost:3306/machineDao");
            
            IDao<Salle> salleDao = (IDao<Salle>) Naming.lookup("rmi://localhost:3306/salleDao");

        } catch (NotBoundException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
