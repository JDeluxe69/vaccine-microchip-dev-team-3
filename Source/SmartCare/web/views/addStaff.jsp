<%-- 
    Document   : Addstaff
    Created on : 11-Dec-2020, 12:09:49
    Author     : Abdirahman Ali - 13013021
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add staff</title>
        <link href="../bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div align="center">
            <form>
                <div class="admin-card">
                    <h5 class="card-header">Add Staff</h5>
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
                            <div class="btn-group" align="center">
                                <button type="button" class="btn btn-lg dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Choose title
                                </button>
                                <div class="dropdown-menu dropdown-menu-right">
                                    <button class="dropdown-item" type="button">Doctor</button>
                                    <button class="dropdown-item" type="button">Nurse</button>
                                </div>
                            </div>

                            <div align="center">
                                <button type="submit" class="btn btn-primary">ADD</button>
                            </div>
                        </div>
                    </div>
                </div>
            </form>  
        </div>
    </body>
</html>
