<%-- 
    Document   : staffLogin
    Created on : 27-Nov-2020, 19:21:34
    Author     : bupal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Staff Login</title>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <div class="row">
            <div class="col-6"  align="left">
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
                    <div class="form-check">
                        <input type="checkbox" class="form-check-input" id="loginCheck">
                        <label class="form-check-label" for="loginCheck">Check me in</label>
                    </div>
                    <button type="submit" class="btn btn-secondary">Login</button>
                </form>       
            </div>
        </div>
    </body>
</html>
