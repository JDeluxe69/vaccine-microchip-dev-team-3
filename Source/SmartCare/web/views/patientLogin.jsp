<%-- 
    Document   : patientLogin
    Created on : 27-Nov-2020, 19:20:56
    Author     : Abdirahman Ali - 13013021
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Login</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>

        <div class="row">
            <div class="col-6"  align="center">
                <h3 align="center">LOGIN</h3>
                <form>
                    <div class="form-group">
                        <label for="inputUserName">Username</label>
                        <input type="username" class="form-control" id="inputUserName" placeholder="Enter Username">
                    </div>
                    <div class="form-group">
                        <label for="inputPassword">Password</label>
                        <input type="password" class="form-control" id="inputPassword" placeholder="Password">
                    </div>
                    <button type="submit" class="btn btn-primary">Login</button>
                </form>
                <div class="center">
                    <p><a href="patientSignup.jsp?id=>">Create Account</a></p>
                </div>          
            </div>
        </div>
    </body>
</html>
