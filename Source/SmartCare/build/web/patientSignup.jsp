<%-- 
    Document   : patientSignup
    Created on : 27-Nov-2020, 19:22:37
    Author     : bupal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Signup</title>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div align="center" class="allpage">
            <h3 align="center"> Patient Registration </h3>
            <form>
                <div class="row">

                    <div class="form-group col-md-6">
                        <input type="text" class="form-control" placeholder="Username">
                    </div>

                    <div class="form-group col-md-6">
                        <input type="text" class="form-control" placeholder="Full name">
                    </div> 
                    <div class="form-group col-md-6">
                        <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
                    </div>
                    <div class="form-group col-md-6">
                        <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
                    </div>
                </div>
                
                <button type="submit" class="btn btn-primary">Sign up</button>
            </form>
        </div>
    </body>
</html>
