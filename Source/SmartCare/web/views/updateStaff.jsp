<%-- 
    Document   : updateStaff
    Created on : 11-Dec-2020, 12:55:48
    Author     : Abdirahman Ali - 13013021
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Staff</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <form>
            <div class="admin-card">
                <h5 class="card-header">Update Staff</h5>
                <div class="col-8">
                    <div class="addStaff" align="center">
                        <div class="form-group row">
                            <input type="integer" class="form-control" placeholder="Staff ID">
                        </div>

                        <div class="form-group row">
                            <input type="text" class="form-control" placeholder="First name">
                        </div> 

                        <div class="form-group row">
                            <input type="text" class="form-control" placeholder="Last name">
                        </div> 
                        <div class="form-group row">
                            <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
                        </div>

                        <div class="form-group row">
                            <input type="text" class="form-control" placeholder="Title">
                        </div> 
                        <button type="submit" class="btn btn-primary">UPDATE</button>
                    </div>
                </div>
            </div>
        </form>       
    </body>
</html>
