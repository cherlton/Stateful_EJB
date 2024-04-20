<%-- 
    Document   : deposit_outcome
    Created on : 20 Apr 2024, 01:23:19
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
        <h1>Deposit Outcome</h1>
        <% 
            double amntDeposit=(double)request.getAttribute("amnt");
        %>
        <table border="1">
            
            <tbody>
                
                <tr>
                    <td>Deposit amount</td>
                    <td><%=amntDeposit%></td>
                </tr>
                

            </tbody>
        </table>
                <p>
                    Please click <a href="start.html">here</a> to continue or <a href="index.html">here</a> to start and go home
                </p>
    </body>
            
</html>
