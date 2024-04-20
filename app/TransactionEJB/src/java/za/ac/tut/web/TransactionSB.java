/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package za.ac.tut.web;

import jakarta.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
@Stateful
public class TransactionSB implements TransactionSBLocal {
  private  List<Double> listDeposit=new ArrayList<>();
    @Override
    public void deposit(double amount) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
 
  listDeposit.add(amount);
    //balanceAmount+=amount;
    }
    

    @Override
    public List<Double> balance() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return listDeposit;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
