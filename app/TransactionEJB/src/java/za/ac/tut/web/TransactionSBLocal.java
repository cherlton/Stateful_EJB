/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package za.ac.tut.web;

import jakarta.ejb.Local;
import java.util.List;


/**
 *
 * @author Student
 */
@Local
public interface TransactionSBLocal {
    void deposit(double amount);
    List<Double> balance();
}
