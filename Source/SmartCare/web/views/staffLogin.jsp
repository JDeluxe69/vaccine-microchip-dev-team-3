<%-- 
    Document   : staffLogin
    Created on : 27-Nov-2020, 19:21:34
    Author     : Abdirahman Ali - 13013021
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Staff Login</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>

        <div class="row">
            <div class="col-6"  align="center">
                <h3 align="center"> STAFF LOGIN</h3>
                <form>
                    <div class="form-group">
                        <label for="inputUserName">Username</label>
                        <input type="username" class="form-control" id="inputUserName" placeholder="Enter Username">
                    </div>
                    <div class="form-group">
                        <label for="inputPassword">Password</label>
                        <input type="password" class="form-control" id="inputPassword" placeholder="Password">
                    </div>
                    <button type="submit" class="btn btn-secondary">Login</button>
                </form>       
            </div>
        </div>
    </body>
</html>
