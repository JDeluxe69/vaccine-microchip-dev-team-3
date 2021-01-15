<%-- 
    Document   : updatePatient
    Created on : 11-Dec-2020, 16:04:31
    Author     : Abdirahman Ali - 13013021
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Patient</title>
        <link href="../bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div align="center" class="allpage">
            <h3>Update Patient</h3>
            <form>
                <div class="row">
                    <div class="form-group col-md-6">
                        <input type="integer" class="form-control" placeholder="NHS Number">
                    </div>

                    <div class="form-group col-md-6">
                        <input type="text" class="form-control" placeholder="First name">
                    </div> 

                    <div class="form-group col-md-6">
                        <input type="text" class="form-control" placeholder="Last name">
                    </div> 

                    <div class="form-group col-md-6">
                        <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
                    </div>

                    <div class="form-group col-md-6">
                        <input type="text" class="form-control" placeholder="Time">
                    </div>    

                    <div class="form-group col-md-6">
                        <input type="text" class="form-control" placeholder="Date">
                    </div>     

                    <div class="form-group col-md-6">
                        <input type="text" class="form-control" placeholder="NHS/Private">
                    </div>   

                    <div class="form-group col-md-6">
                        <input type="text" class="form-control" placeholder="Service">
                    </div>    

                    <div class="form-group col-md-6">
                        <input type="text" class="form-control" placeholder="Cost">
                    </div>    

                    <div class="form-group col-md-6">
                        <input type="text" class="form-control" placeholder="Prescribed">
                    </div>    

                </div>
                <button type="submit" class="btn btn-primary">Sign up</button>
            </form>
        </div>
    </body>
</html>
