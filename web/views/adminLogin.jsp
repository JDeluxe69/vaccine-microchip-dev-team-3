<%-- 
    Document   : adminLogin
    Created on : 27-Nov-2020, 19:22:06
    Author     : bupal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
        <link href="../bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="row">
            <div class="col-6"  align="center">
                <h3 align="center"> ADMIN LOGIN</h3>
                <form  action="/SmartCare/api/login" method="post">
                    <div class="form-group">
                        <label for="inputUserName">Username</label>
                        <input type="username" name="username" class="form-control" id="inputUserName" placeholder="Enter Username" value="">
                    </div>
                    <div class="form-group">
                        <label for="inputPassword">Password</label>
                        <input type="password" name="password" class="form-control" id="inputPassword" placeholder="Password" value="">
                    </div>
                    <button type="submit" class="btn btn-secondary">Login</button>
                </form>       
            </div>
        </div>
    </body>
</html>