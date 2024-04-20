<%-- 
    Document   : balance_amount
    Created on : 20 Apr 2024, 01:28:28
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Balance</h1>
        <%
       
        List<Double> listBalance=(List<Double>)request.getAttribute("balanceAmount");
        %>
        <table border="1">
          
            <tbody>
                <%
                for(int x=0;x<listBalance.size();x++){
                double balance=listBalance.get(x);
                    int y=x+1;
                %>
                <tr>
                    <td>Balance number:<%=y%></td>
                    <td><%=balance%></td>
                </tr>
                <%
                    }
                %>
               
            </tbody>
        </table>

        <p>
                    Please click <a href="balance.html">here</a> to continue or <a href="index.html">here</a> to start and go home
                </p>
    </body>
</html>
