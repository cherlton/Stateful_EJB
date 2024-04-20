/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class ControllerServlert extends HttpServlet {
@EJB TransactionSBLocal tsb;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String op=request.getParameter("op");
      
       String url="index.html";
       if(op.equals("deposit")){
           String amountStr=(String)request.getParameter("deposit_amount");
            Double amnt=Double.parseDouble(amountStr);
         tsb.deposit(amnt);
         request.setAttribute("amnt",amnt);
           url="deposit_outcome.jsp";
          
          
       }else if(op.equals("balance")){
            //String amountStr=((String)request.getParameter("deposit_amount"));
         
            List<Double> balanceAmount=tsb.balance();
          
           request.setAttribute("balanceAmount", balanceAmount);
           url="balance_amount.jsp";
       }
        RequestDispatcher disp =request.getRequestDispatcher(url);
        disp.forward(request, response);
    }

   
// </editor-fold>

}
